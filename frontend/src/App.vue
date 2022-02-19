<template>
   <div id="app">
       <div class="columns header is-multiline is-vcentered">
           <div class="column is-two-fifths app-logo-header">
            <img src="./img/EP-Logo.png" alt="Expedition Logo"> 
            </div>
        <div class="column is-three-fifths app-quote-header">
           <h1 id="quote">“We were now about to penetrate a country at least two thousand miles in width, on which the foot of civilized man had never trod. The good or evil it had in store for us was for experiment yet to determine... I could but esteem this moment of my departure as among the most happy of my life. (Meriwether Lewis)” ― John Bakeless, The Journals of Lewis and Clark</h1>
        </div>
       
       <nav class="navbar column is-full" role="navigation" aria-label="main navigation">
        <!-- <div class="navbar-brand">
        <a class="navbar-item" href="https://bulma.io">
          <img src="https://bulma.io/images/bulma-logo.png" width="112" height="28">
         </a>
         <a role="button" class="navbar-burger burger" aria-label="menu" aria-expanded="false" data-target="navbarBasicExample">
          <span aria-hidden="true"></span>
          <span aria-hidden="true"></span>
          <span aria-hidden="true"></span>
         </a>
        </div> -->
            <div id="navbar" class="navbar-menu is-active">
                <div class="navbar-start">
                    <a class="navbar-item is-half">   <!-- Link to "/" -->
                        <router-link to="/" class="routerLink">Home</router-link>
                    </a>
                    <a class="navbar-item">   <!-- Link to "/search" -->
                    <router-link to="/search" class="routerLink">Create An Itinerary</router-link>
                    </a>
                </div>
                <div class="navbar-end">
                    <a class="navbar-item">   <!-- Link to "/login" -->
                    <router-link to="/login" class="routerLink">Log In</router-link>
                    </a>                    
                    <a class="navbar-item">   <!-- Link to "/register" -->
                    <router-link to="/register" class="routerLink">Need an account?</router-link>
                    </a>
                    <a class="navbar-item">   <!-- Link to "/logout" -->
                    <router-link to="/" class="routerLink">Log Out</router-link>
                    </a>
                </div>
            </div>
       </nav>
  </div>

     <router-view></router-view>

    <div class="columns header is-multiline is-vcentered">

      <div class="column app-quote-footer">
        <h1>Team CORS Inc. &copy; 2019</h1>
      </div>
    </div>
  </div>
 
</template>
 
<script>
import Vue from 'vue';
import Buefy from 'buefy';
import 'buefy/dist/buefy.css';
// import MenuIcon from 'vue-material-design-icons/Menu.vue';
// import 'vue-material-design-icons/styles.css';

Vue.use(Buefy);

// import Landmark from "@/views/Landmark.vue";
// import Itinerary from "@/views/Itinerary.vue";
 
 export default {
   name: 'app',
   components: {
     // Landmark,
     // Itinerary
       },
   methods: {
     logout() {
       this.$store.dispatch("auth/logout")
       .then(() => {
         this.$router.push("/")
       });
     }
   }
 }
</script>
 
<style>
 
 body {
   background-image: url("../src/img/old-map-wallpaper-bw.jpg");
   background-color: #aaa;
   font-family: Palatino, "Palatino Linotype", "Palatino LT STD", "Book Antiqua", Georgia, serif;
   font-weight: 800;
 }
 
 article {
   border: 2px solid black;
   padding: 1.25rem;
 }
 
 .header {
   background-color: #170061;
 }

 #quote {
   font-size: 18px;
   font-style: italic;
 }
 
 #navbar {
   background-color: #2F2F2F;
 
 }

 .home {
   color: white;
 }

#about {
  /* font-family: Palatino, "Palatino Linotype", "Palatino LT STD", "Book Antiqua", Georgia, serif; */
  text-align: center;
  color: black;
  max-width: 80%;
}
  .account {
   color: white;
 }

 .routerLink {
   color: white;
 }
 
 #tour {
   background-color: #eee;
   }
 
 .app-quote-header h1 {
   margin-top: 10px;
   margin-right: 5px;
   font-size: 21px;
   color: white;
 }

  .app-quote-footer h1 {
   margin: 10px 0px 10px 25px;
   font-size: 18px;
   color: white;
 }
 
 h2 {
   font-size: 48px;
   /* text-shadow: 5px 5px 5px antiquewhite; */
   /* margin-top: 0px;
   margin-bottom: 10px; */
 }
 
 img {
   border-radius: 2px;
 }
 
 p {
   font-size: 24px;
   margin: 20px;
 }
 
 .title {
   margin: 0px;
 }
 
 .subtitle {
     margin: 0px;
 }
 
 #section-row {
   margin: 10px;
 }
 
</style>