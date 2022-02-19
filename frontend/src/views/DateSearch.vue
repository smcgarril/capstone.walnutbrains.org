<template>
  <div class="control field">
    <div class="control field example">
      <datepicker
        id="search-date"
        name="search-date"
        placeholder="Start Date"
      ></datepicker>
    </div>
    <div class="control" @click="filterTasksDate">
      <button class="button is-link">Submit</button>
    </div>
  </div>
</template>

<script>
import Datepicker from 'vuejs-datepicker';

export default {
  name: "DateSearch",
    components: {
        Datepicker
    },
  methods: {
    filterTasksDate() {
      const queryDate = document.getElementById("search-date").value;
      this.$emit("filter-tasks-date", queryDate);
      
    }
  }
};
</script>