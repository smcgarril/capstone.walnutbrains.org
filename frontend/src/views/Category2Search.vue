<template>
    
    <div class="control field">
        <div type="select" class="select search">
            <select id="search-category2" name="search-category2" @change="filterTasksCategory2">
                <option value="">Select a Category</option>
                <option value="Art">Art</option>
                <option value="History">History</option>
                <option value="Food">Food</option>
                <option value="Nature">Nature</option>
                <option value="Oddities">Oddities</option>
                <option value="Sports">Sports</option>
            </select>
        </div>
    </div>
    
</template>

<script>
export default {
    name: 'Category2Search',
  
    methods: {
        filterTasksCategory2() {
            const queryCategory2 = document.getElementById('search-category2').value;
            this.$emit('filter-tasks-category2', queryCategory2);
        }
        
    }
    
}
</script>