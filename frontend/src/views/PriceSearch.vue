<template>
    
    <div class="control field">
        <div type="select" class="select search">
            <select id="search-price" name="search-price" @change="filterTasksPrice">
                <option value="">Select a Price</option>
                <option value="0">Free</option>
                <option value="10">$</option>
                <option value="15">$$</option>
                <option value="20">$$$</option>
            </select>
        </div>
    </div>
    
</template>

<script>
export default {
    name: 'PriceSearch',
    
   
    methods: {
        filterTasksPrice() {
            const queryPrice = document.getElementById('search-price').value;
            this.$emit('filter-tasks-price', queryPrice);
        }
        
    }
    
}
</script>