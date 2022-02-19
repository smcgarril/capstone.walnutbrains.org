import Vue from 'vue'
import Router from 'vue-router'
import auth from './auth'
import Home from './views/Home.vue'
import Login from './views/Login.vue'
import Logout from './views/Logout.vue'
import Register from './views/Register.vue'
import SearchPage from './views/SearchPage'
import Itinerary from './views/Itinerary'
import WelcomePage from './views/WelcomePage'
import Password from './views/Password'
// import HomeIcon from 'vue-material-design-icons/Home.vue';

Vue.use(Router)

/**
 * The Vue Router is used to "direct" the browser to render a specific view component
 * inside of App.vue depending on the URL.
 *
 * It also is used to detect whether or not a route requires the user to have first authenticated.
 * If the user has not yet authenticated (and needs to) they are redirected to /login
 * If they have (or don't need to) they're allowed to go about their way.
 */

const router = new Router({
  mode: 'history',
  base: process.env.BASE_URL,
  routes: [
    {
      path: '/',
      name: 'home',
      component: Home,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/login",
      name: "login",
      component: Login,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/logout",
      name: "logout",
      component: Logout,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/register",
      name: "register",
      component: Register,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/search",
      name: "search",
      component: SearchPage,
      meta: {
        requiresAuth: false
      },
      props: true
    },
    {
      path: "/itinerary",
      name: "itinerary",
      component: Itinerary,
      meta: {
        requiresAuth: false
      }
    },
    {
      path: "/welcome",
      name: "welcome",
      component: WelcomePage,
      meta: {
        requiresAuth: true
      }
    },
    {
      path: "/password",
      name: "password",
      component: Password,
      meta: {
        requiresAuth:false
      }
    }
  ]
})

router.beforeEach((to, from, next) => {
  // Determine if the route requires Authentication
  const requiresAuth = to.matched.some(x => x.meta.requiresAuth);
  const user = auth.getUser();

  // If it does and they are not logged in, send the user to "/login"
  if (requiresAuth && !user) {
    next("/");
  } else {
    // Else let them go to their next destination
    next();
  }
});

export default router;
