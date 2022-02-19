<template>
  <div>
    <h3 id="small-heading">About Us</h3>
    <p class="content" id="about-us">On August 31, 1803, Meriwether Lewis and a mapmaker named William Clark began an 8,000 mile journey westward from Pittsburgh to explore the unknown. If Pittsburgh is your point of origin, you won't need a Lewis and Clark to take you from The Point to Oregon. Expedition Pittsburgh is your exclusive city tour guide for any Pittsburgh adventure your inner-explorer can create...within these 48 options. </p>

    <h1 id="main-heading">Tours By Interest</h1>
    
    <div class="tile is-ancestor" id="section-row">
      <div class="tile is-parent">
        <article class="tile is-child box has-text-centered" id="tour">
          <figure class="image is-4by3">
            <a><router-link to="/search"><img src="../img/art.jpg" alt="art"/></router-link></a>
          </figure>
          <p class="title">Art</p>
          <p class="subtitle">Elevate your senses through some of the traditional and 
            contemporary art on display on the inside and the outside of buildings throughout the city!</p>             
        </article>
      </div>
      <div class="tile is-parent">
        <article class="tile is-child box has-text-centered" id="tour">
          <figure class="image is-4by3">
             <a><router-link to="/search"><img src="../img/food.jpg" alt="food"/></router-link></a>
          </figure>
          <p class="title">Food</p>
          <p class="subtitle">The greatest challenge of finding a good place to eat in Pittsburgh is limiting it to one place! 
            Get to know the city through some of this standard Pittsburgh fare.</p>           
        </article>
      </div>
      <div class="tile is-parent">
        <article class="tile is-child box has-text-centered" id="tour">
          <figure class="image is-4by3">
             <a><router-link to="/search"><img src="../img/local.jpg" alt="local"/></router-link></a>
          </figure>
          <p class="title">Oddities</p>
          <p class="subtitle">Like to take the road less traveled? This tour takes you off the beaten path to some 
            of the more peculiar places in Pittsburgh and shows you everything <i>else</i> that this city has to offer.</p>              
        </article>
      </div>
    </div>

    <div class="tile is-ancestor" id="section-row">
      <div class="tile is-parent">
        <article class="tile is-child box has-text-centered" id="tour">
          <figure class="image is-4by3">
             <a><router-link to="/search"><img src="../img/history.jpg" alt="history"/></router-link></a>
          </figure>
          <p class="title">History</p>
          <p class="subtitle">Whether your interests are more domestic or international, Pittsburgh has the place 
            for you to explore the richness of human history, and even the history of the planet itself.</p>                        </article>
      </div>
      <div class="tile is-parent">
        <article class="tile is-child box has-text-centered" id="tour">
          <figure class="image is-4by3">
             <a><router-link to="/search"><img src="../img/nature.jpg" alt="nature"/></router-link></a>
          </figure>
          <p class="title">Nature</p>
          <p class="subtitle">Some of the best views of Pittsburgh are right outside your front door. 
            An abundance of parks and recreation await you in the great outdoors around this city.</p>         
        </article>        
      </div>
      <div class="tile is-parent">
        <article class="tile is-child box has-text-centered" id="tour">
          <figure class="image is-4by3">
             <a><router-link to="/search"><img src="../img/sports.jpg" alt="sports"/></router-link></a>
          </figure>
          <p class="title">Sports</p>
          <p class="subtitle">Pittsburgh is a sports town, and no visit to the 'Burgh would be complete without 
            a visit to some of the locations that commemorate that allegiance to the city's local teams.</p>            
        </article>
      </div>
    </div>           
  </div>
</template>

<script>
// import Login from './Login.vue'
// import Logout from './Logout.vue';

export default {
  name: 'home',
  data() {
    return {
      categoryFromHome: ''
    }
  },
}
</script>




<style>

body {
  background-image: url("../img/old-map-wallpaper-bw.jpg");
  background-color: #aaa;
  font-family: Palatino, "Palatino Linotype", "Palatino LT STD", "Book Antiqua", Georgia, serif;
}

article {
  border: 2px solid black;
  padding: 1.25rem;
}

#main-heading {
  display: flex;
  justify-content: center;
  font-size: 48px;
  font-weight: bold;
}

#small-heading {
  display: flex;
  justify-content: center;
  font-size: 36px;
  font-weight: bold;
}

.content {
  text-align: center;
  color: #2F2F2F;
  font-size: 18px;
}

#tour {
  background-color: #eee;
}

h2 {
  font-size: 48px;
  text-shadow: 5px 5px 5px antiquewhite;
  margin-top: 0px;
  margin-bottom: 10px;
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