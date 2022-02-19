<template>
    <div>
        <div>
            <p>{{id}}</p>
            <button :disabled="landmarkInItinerary" @click="$emit('landmark-in-itinerary',landmark)" class="button">
                {{landmarkInItinerary ? 'Added to itinerary': 'Add to Itinerary'}}
            </button>
        </div>
    </div>
</template>

<script>
export default{
    props: ['landmark','landmarkInItinerary']
}
</script>