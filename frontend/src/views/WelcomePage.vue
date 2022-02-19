<template>
  <div id="welcome" class="text-center">
      <h1 id="page-heading">Welcome, Nora!</h1>
      
      <div id="itinerary-list" class="text-center">
        <h2 id="sub-heading">Saved Itineraries</h2>
        
        <div class="tile is-ancestor" id="section-row">
        
          <div class="tile is-parent">
            <article class="tile is-child is-6 box has-text-centered" id="itinerary">
              <figure class="image is-4by3">
                <img src="../img/22_img.jpg" alt="22"/>
              </figure>
              <p id="caption" class="title">December 20, 2019 Itinerary</p>
            </article>
          </div>
          
          <div class="tile is-parent">
            <article class="tile is-child is-6 box has-text-centered" id="itinerary">
              <figure class="image is-4by3">
                <img src="../img/12_img.jpg" alt="12"/>
              </figure>
              <p id="caption" class="title">October 26, 2019 Itinerary</p>        
            </article>        
          </div>
          
          <div class="tile is-parent">
            <article class="tile is-child is-6 box has-text-centered" id="itinerary">
              <figure class="image is-4by3">
                <img src="../img/17_img.jpg" alt="17"/>
              </figure>
              <p id="caption" class="title">September 7, 2019 Itinerary</p>            
            </article>
          </div>
        </div>

        

      </div>
      
      <div id="preferences" class="text-center">
        <h2 id="sub-heading">Your Preferences</h2>
          <div content>
            <p id="favorite-neighborhoods">Favorite Neighborhoods: Oakland</p>
            <p id="favorite-categories">Favorite Categories: History, Sports</p>
          </div>
              <!-- <figure class="image is-4by3">
              <img :src="'http://localhost:8080/AuthenticationApplication/img/' + landmark.id + '_img.jpg'"/>
              </figure> -->
    </div>
              <button class="button input" @click="changePreferences(preference)">Change Preferences</button>

  </div>
</template>

<script>
import auth from '../auth';
import Itinerary from './Itinerary';
// import AccountSettings from './AccountSettings';

export default {
  data() {
    return {
        itineraries: [
            'December 20, 2019 Itinerary',
            'October 26, 2019 Itinerary',
            'September 7, 2019 Itinerary'
        ]
    }
  },
  methods: {
      showUserItineraries() {
          const userId = this.user;

          if (userId == '') {
          return this.itineraries.filter(itinerary =>
            itinerary.userId.match())
          }
          // set innerHTML to ''
          // v-for each itinerary
          // create li
          // set innerText to itinerary.name

      }
  },
  // created() {
  //     this.itineraries = this.$itinerary.itineraries;
  // }
}
</script>

<style>
#page-heading {
  font-size: 36px;
  text-align: center;
  font-weight: bold;
}

#sub-heading {
  font-size: 28px;
  text-align: center;
}

#caption {
  font-size: 18px;
}

input {
  margin: 5px;
  padding: 5px;
}

button {
  margin: 5px;
  padding: 5px;
}
</style>
