<template>
    
        <!-- <div class="control field">
              <div type="text" class="select search" id="search" name="search" v-on:keyup="filterTasks">
                <select>
                  <option>All Neighborhoods</option>
                  <option>Downtown</option>
                  <option>Manchester</option>
                  <option>Northside</option>
                  <option>Oakland</option>
                  <option>Point Breeze</option>
                  <option>Rankin</option>
                  <option>Squirrel Hill</option>
                  <option>Strip District</option>
                </select>
              </div>
            </div> -->

        <div class="search">
            <input type="text" id="search" name="search" v-on:change="filterTasks" placeholder="Search Categories..."/>
        </div>
    
</template>

<script>
export default {
    methods: {
        filterTasks() {
            const query = document.getElementById('search').value;
            this.$emit('filter-tasks', query);
        }
        
    }
    
}
</script>