<template>
    
    <div class="control field">
        <div type="select" class="select search">
            <select id="search-neighborhood1" name="search-neighborhood1" @change="filterTasksNeighborhood1">
                <option value="">Select a Neighborhood</option>
                <option value="Downtown">Downtown</option>
                <option value="Manchester">Manchester</option>
                <option value="Northside">Northside</option>
                <option value="Oakland">Oakland</option>
                <option value="Point Breeze">Point Breeze</option>
                <option value="Rankin">Rankin</option>
                <option value="Squirrel Hill">Squirrel Hill</option>
                <option value="Strip District">Strip District</option>
                <option value="">All Neighborhoods</option>
            </select>
        </div>
    </div>
    
</template>

<script>
export default {
    name: 'Neighborhood1Search',
   
    methods: {
        filterTasksNeighborhood1() {
            const queryNeighborhood1 = document.getElementById('search-neighborhood1').value;
            this.$emit('filter-tasks-neighborhood1', queryNeighborhood1);
        }
        
    }
    
}
</script>