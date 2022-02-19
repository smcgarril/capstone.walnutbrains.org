<template>
  <div class="control field">
    <textarea
      type="text"
      class="search textarea"
      id="search-location"
      name="search-location"
      placeholder="Enter a Starting Address..."
    ></textarea>
    <div class="control" @click="filterTasksLocation">
      <button class="button is-link">Submit</button>
    </div>
  </div>
</template>

<script>
export default {
  name: "LocationSearch",

  methods: {
    filterTasksLocation() {
      const queryLocation = document.getElementById("search-location").value;
      this.$emit("filter-tasks-location", queryLocation);
    }
  }
};
</script>