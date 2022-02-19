<template>
    
    <div class="control field">
        <div type="select" class="select search">
            <select id="search-category1" name="search-category1" @change="filterTasksCategory1">
                <option value="">Select a Category</option>
                <option value="Art">Art</option>
                <option value="History">History</option>
                <option value="Food">Food</option>
                <option value="Nature">Nature</option>
                <option value="Oddities">Oddities</option>
                <option value="Sports">Sports</option>
                <option value="">All Categories</option>
            </select>
        </div>
    </div>
    
</template>

<script>
export default {
    name: 'Category1Search',
   
    methods: {
        filterTasksCategory1() {
            const queryCategory1 = document.getElementById('search-category1').value;
            this.$emit('filter-tasks-category1', queryCategory1);
        }
        
    }
    
}
</script>