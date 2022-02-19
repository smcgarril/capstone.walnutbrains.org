<template>
    <div id="logout" class="text-center">
        <form class="form-logout">
        <router-link :to="{name:'home'}">Log out?</router-link>
        </form>
    </div>
</template>

<script>
import auth from '../auth';

export default {
    name: 'logout',
    components: {

    }

}
</script>

<style>

</style>
