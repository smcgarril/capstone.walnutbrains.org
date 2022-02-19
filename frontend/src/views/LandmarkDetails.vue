<template>
  <div class="landmark-detail">
      <div class="landmark-detail-page-image">
        <img class="detail-image" src="../img/art.jpg" alt="art">
      </div>
      <div class="landmark-detail-page">
        <h2>Landmark Name</h2>
        <p>venue type</p>
        <p>Landmark Description</p>
        <p>available days/hours</p>  
      </div>   
  </div>
  
</template>

<script>
export default {


}
</script>

<style>

body {
  background-image: url("../img/old-map-wallpaper.jpg");
  background-color: #aaa;
}

#main-heading {
  font-size: 60px;
}
.tours {
  display: flex;
  justify-content: center;
}
#main-heading {
  display: flex;
  justify-content: center;
  text-shadow: 5px 5px 5px antiquewhite;
}

.tour {
display: flex;
flex-direction: column;
justify-content: center;
align-items: center;
width: 600px;
height: 600px;
margin: 20px;
padding: 10px;
border: 2px solid black;
}

h2 {
  font-size: 48px;
  text-shadow: 5px 5px 5px antiquewhite;
  margin-top: 0px;
}

.main-image {
  width: 400px;
  box-shadow: 5px 5px 5px;
}

p {
  height: 96px;
  font-size: 24px;
  text-shadow: 2px 2px 2px antiquewhite;
  margin: 20px;
}
</style>


