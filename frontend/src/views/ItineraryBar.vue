<template>
  <div class="tile is-parent" id="itinerary-list">
    <div class="tile is-vertical is-1 box has-text-centered itinerary-tile">
      <p>Date</p>
      <p>Time</p>
      <p>Length</p>
      <button class="button input itinerary-button" @click="createItinerary()">Create Itinerary</button>
      <button class="button input itinerary-button" @click="deleteItinerary()">Delete Itinerary</button>
    </div>

    <article 
      class="tile is-child box is-2 has-text-centered itinerary-tile" 
      v-for="result in itineraryResults">
      <figure class="image is-4by3">
        <img
          :src="'http://localhost:8080/AuthenticationApplication/img/' + result.id + '_img.jpg'"
          id="itinerary-image"
        />
      </figure>
      <p id="itinerary-tile-name">{{result.name}}</p>
      <button
        class="button"
        id="itinerary-tile-button"
        @click="removeFromItinerary(result)"
      >Remove From Itinerary</button>
    </article>
  </div>
</template>

<script>
export default {
  props: ["itineraryResults"],

  methods: {
    removeFromItinerary(result) {
      let landmarkToRemove = this.itineraryResults.indexOf(result);
      this.itineraryResults.splice(landmarkToRemove, 1);
    },
    createItinerary() {
      // this is where we would fetch the API with optimize=true
      console.log(this.itineraryResults);
    },
    deleteItinerary() {
      this.itineraryResults = [];
    }
  }
};
</script>

<style>
.itinerary-tile  {
    background-color: #eee;
    padding: 10px;
    border: 2px solid black;
    max-height: 300px;
}

#itinerary-tile-name  {
    font-size: 14px;
}

#itinerary-image  {
    max-height: 100px;
}

#itinerary-list .itinerary-button  {
    white-space: normal;
    height: auto;
}

#itinerary-tile-button  {
    white-space: normal;
    height: auto;
}
</style>