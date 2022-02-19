<template>
  <div class="control field">
    <!-- <div class="control field">
      <b-timepicker
        placeholder="End Time..."
        icon="clock"
        id="search-end-time"
        name="search-end-time"
        editable
      ></b-timepicker>
    </div> -->
    <div class="control field">
    <b-field grouped group-multiline>
      <div class="control">
        <b-switch v-model="formatAmPm">PM/AM</b-switch>
      </div>
    </b-field>
      <b-timepicker
        rounded
        placeholder="End Time"
        icon="clock"
        id="search-end-time"
        name="search-end-time"
        :hour-format="format"
      ></b-timepicker>
    </div>
    <div class="control" @click="filterTasksEndTime">
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
  name: "EndTimeSearch",

  data() {
    return {
      formatAmPm: false,
      enableSeconds: false
    };
  },
  computed: {
    format() {
      return this.formatAmPm ? "12" : "24";
    }
  },
  methods: {
    filterTasksEndTime() {
      const queryEndTime = document.getElementById("search-end-time").value;
      this.$emit("filter-tasks-end-time", queryEndTime);
    }
  }
};
</script>