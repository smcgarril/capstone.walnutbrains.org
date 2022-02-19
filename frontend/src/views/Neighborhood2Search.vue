<template>
    
    <div class="control field">
        <div type="select" class="select search">
            <select id="search-neighborhood2" name="search-neighborhood2" @change="filterTasksNeighborhood2">
                <option value="">Select a Neighborhood</option>
                <option value="Downtown">Downtown</option>
                <option value="Manchester">Manchester</option>
                <option value="Northside">Northside</option>
                <option value="Oakland">Oakland</option>
                <option value="Point Breeze">Point Breeze</option>
                <option value="Rankin">Rankin</option>
                <option value="Squirrel Hill">Squirrel Hill</option>
                <option value="Strip District">Strip District</option>
            </select>
        </div>
    </div>
    
</template>

<script>
export default {
    name: 'Neighborhood2Search',
   
    methods: {
        filterTasksNeighborhood2() {
            const queryNeighborhood2 = document.getElementById('search-neighborhood2').value;
            this.$emit('filter-tasks-neighborhood2', queryNeighborhood2);
        }
        
    }
    
}
</script>