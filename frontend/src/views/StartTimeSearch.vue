<template>
  <div class="control field">
    <!-- <div class="control field">
      <b-timepicker
        placeholder="Start Time..."
        icon="clock"
        id="search-start-time"
        name="search-start-time"
        editable
      ></b-timepicker>
    </div> -->
    <div class="control field">
    <b-field grouped group-multiline>
      <div class="control">
        <b-switch v-model="formatAmPm1">PM/AM</b-switch>
      </div>
    </b-field>
      <b-timepicker
        rounded
        placeholder="Start Time"
        icon="clock"
        id="search-start-time"
        name="search-start-time"
        :hour-format="format"
      ></b-timepicker>
    </div>
    <div class="control" @click="filterTasksStartTime">
      <button class="button is-link">Submit</button>
    </div>
  </div>
</template>

<script>
import Vue from "vue";
import Buefy from "buefy";
import "buefy/dist/buefy.css";
Vue.use(Buefy);

export default {
  name: "StartTimeSearch",

  data() {
    return {
      formatAmPm1: false,
      enableSeconds: false
    };
  },
  computed: {
    format() {
      return this.formatAmPm1 ? "12" : "24";
    }
  },
  methods: {
    filterTasksStartTime() {
      const queryStartTime = document.getElementById("search-start-time").value;
      this.$emit("filter-tasks-start-time", queryStartTime);
    }
  }
};
</script>


