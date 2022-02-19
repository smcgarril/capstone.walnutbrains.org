<template>
  <div id="password" class="text-center">
      <h1 class="page-form-title">Account Settings</h1>
        <form class="form-password" @submit.prevent="login">
        <div class="page-form-container account-settings-form-container">
        
        <base-tabs v-model="currentTab" :options="options"/>
        <register-form v-if="currentTab === ''"/>
        <password-settings-form v-else-if="currentTab === 'password'"/>
            <div class="password-settings-form page-form">
                <div class="field">
                    <label class="label">Current Password</label>
                    <base-input v-model="existingPassword" type="password" :errors="$v.existingPassword"/>
                </div>
                <div class="field">
                    <label class="label">Confirm Password</label>
                    <base-input v-model="confirmPassword" type="password" :errors="$v.confirmPassword"/>
                </div>
                <div class="field">
                    <label class="label">New Password</label>
                    <base-input v-model="newPassword" type="password" :errors="$v.newPassword"/>
                </div>
                <div class="submit-field">
                    <span v-if="errorMessage" class="error-message">{{ errorMessage }}</span>
                    <span v-if="success" class="success-message">
                        <i class="fas fa-check"></i> Saved
                    </span>
                    <base-button :disabled="loading" @click="onSubmit">{{ loading ? 'Saving...' : 'Save' }}</base-button>
                </div>
            </div>
        </div>
      </form>
  </div>
</template>

<script>
import Register from './Register'
export default {
  data () {
    return {
      user: {
        username: '',
        firstName: '',
        lastName: '',
        email: '',
        existingPassword: '',
        confirmPassword: '',
        newPassword: '',
        role: 'user',
        category1: '',
        category2: '',
        neighborhood1: '',
        neighborhood2: ''
      },
      passwordErrors: false,
    };
  },
    methods: {
        changePassword() {
            let p = JSON.stringify(this.user);
            console.log(p);
            fetch(`${process.env.VUE_APP_REMOTE_API}/welcome`, {
                method: 'POST',
                headers: {
                    Accept: 'application/json',
                    'Content-Type': 'application/json',
                },
                body: JSON.stringify(this.user),
            })
            .then((response) => {
                if (response.ok) {
                    this.$router.push({ path: '/login', query: { changePassword: 'success'} });
                } else {
                    this.passwordErrors = true;
                }
            })
            .then((err) => console.error(err));
        },
    },
};
</script>

<style 

</style>