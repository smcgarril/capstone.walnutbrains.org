package com.techelevator.controller;

import java.util.List;

import javax.validation.Valid;

import org.jboss.logging.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.techelevator.authentication.AuthProvider;
import com.techelevator.authentication.JwtTokenHandler;
import com.techelevator.authentication.UnauthorizedException;
import com.techelevator.authentication.UserCreationException;
import com.techelevator.model.Itinerary;
import com.techelevator.model.ItineraryDao;
import com.techelevator.model.Landmark;
import com.techelevator.model.LandmarkDao;
import com.techelevator.model.User;

/**
 * AccountController
 */
@RestController
public class AccountController {
    @Autowired
    private AuthProvider auth;

    @Autowired
    private JwtTokenHandler tokenHandler;
    
    @Autowired
	private LandmarkDao landmarkDao;
    
    @Autowired
    private ItineraryDao itineraryDao;

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public String login(@RequestBody User user, RedirectAttributes flash) throws UnauthorizedException {
        if (auth.signIn(user.getUsername(), user.getPassword())) {
            User currentUser = auth.getCurrentUser();
            return tokenHandler.createToken(user.getUsername(), currentUser.getRole());
        } else {
            throw new UnauthorizedException();
        }
    }

    @RequestMapping(path = "/register", method = RequestMethod.POST)
    public String register(@Valid @RequestBody User user, BindingResult result) throws UserCreationException {
        if (result.hasErrors()) {
            String errorMessages = "";
            for (ObjectError error : result.getAllErrors()) {
                errorMessages += error.getDefaultMessage() + "\n";
            }
            throw new UserCreationException(errorMessages);
        }
        auth.register(user.getUsername(), user.getFirstName(), user.getLastName(), user.getEmail(), user.getPassword(), user.getRole(),
        				user.getSecurityQuestion(), user.getSecurityAnswer(), user.getCategory1(), user.getCategory2(), user.getNeighborhood1(), user.getNeighborhood2());
        return "{\"success\":true}";
    }
    

    
    @RequestMapping(path = "/search", method = RequestMethod.GET)
	public @ResponseBody List<Landmark> landmark() {
		
		List<Landmark> landmarks = landmarkDao.getAllLandmarks();
		
		return landmarks;
	}
    
    @RequestMapping(path = "/welcome", method = RequestMethod.GET)
    public @ResponseBody List<Itinerary> itinerary() {
    	
    	List<Itinerary> itineraries = itineraryDao.getAllItineraries();
    	
    	return itineraries;
    }
    
    
    
    
    
    

}