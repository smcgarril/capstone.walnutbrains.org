<template>
  <div id="password" class="text-center">
    <form class="form-password" @submit.prevent="passwordreset">
      <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
        Invalid Response.
      </div>
      <div class="alert alert-success" role="alert" v-if="this.$route.query.password">
        Your password has been updated.
      </div>

      <div class="field">
        <label for="email" class="label">Username or email associated with your account: </label>
        <div class="control">
          <input
            type="text"
            id="email"
            class="input form-control"
            placeholder="Username or Email"
            v-model="user.email"
            v-model="user.username"
            required
          />
        </div>
      </div>
  <div id="security-section" class="text-center">
      <div class="field">
        <label for="securityQuestion" class="label">Security Question: </label>
        <div content>
          <p>What was your dream job when you were a child?</p>
        </div>
      </div>

      <div class="field">
        <label for="securityAnswer" class="label">Your answer: </label>
        <div class="control">
          <input type="text"
          id="securityAnswer"
          class="input form-control"
          placeholder="Response"
          v-model="user.security_answer"
          required
          autofocus
          />
        </div>
      </div>      

          <div class="field is-grouped">
            <div class="control">
              <button class="button is-link">Submit</button>
            </div>
          </div>
    </form>
  </div>
</template>

<script>
import auth from '../auth';
import Login from './Login';

export default {
  name: 'password',
  components: {
    // WelcomePage
  },
  data() {
    return {
      user: {
        username: '',
        securityQuestion: '',
        securityResponse: '',
      },
      invalidCredentials: false,
    };
  },
  methods: {
    verifyAccount() {
      fetch(`${process.env.VUE_APP_REMOTE_API}/password`, {
        method: 'POST',
        headers: {
          Accept: 'application/json',
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(this.user),
        
      })
        .then((response) => {
          if (response.ok) {
            this.$router.push({ path: '/password', query: { authorization: 'success' } });
          } else {
            this.invalidCredentials = true;
          }
        })
        .then((token) => {
          if (token != undefined) {
            if (token.includes('"')) {
              token = token.replace(/"/g, '');
            }
            auth.saveToken(token);
            this.$router.push('/passwordreset');
          }
        })
        .catch((err) => console.error(err));
    },
    },
    changePassword() {

    }

}
</script>

<style>

</style>
