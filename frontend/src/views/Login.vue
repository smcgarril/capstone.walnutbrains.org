<template>
  <div id="login" class="text-center">
    <form class="form-signin" @submit.prevent="login">
      <div class="alert alert-danger" role="alert" v-if="invalidCredentials">
        Invalid username password combination!
      </div>
      <div class="alert alert-success" role="alert" v-if="this.$route.query.registration">
        Thank you for registering, please sign in.
      </div>


      <div class="columns">
        <div class="column is-one-quarter">
          <div class="field">
            <label for="username" class="label sr-only">Username</label>
            <div class="control">
              <input
                type="text"
                id="username"
                class="input form-control"
                placeholder="Username"
                v-model="user.username"
                required
                autofocus
              />
            </div>
          </div>
        </div>

        <div class="column is-one-quarter">
          <div class="field">
            <label for="password" class="label password sr-only">Password</label>
            <div class="control">
              <input
                type="password"
                id="password"
                class="input form-control"
                placeholder="Password"
                v-model="user.password"
                required
              />
            </div>
          </div>
        </div>

        <div class="column" id="login-submit-button">
          <div class="field is-grouped">
            <div class="control">
              <button class="button is-link">Submit</button>
            </div>
          </div>
        </div>

        <div class="column" id="registration-reroute">
          <router-link :to="{ name: 'register' }">Need an account?</router-link>
        </div>

        <div class="column" id="password-reset">
          <router-link :to="{ name: 'password' }">Forgot Password?</router-link>
        </div>
      </div>
    </form>
    <home-page></home-page>
  </div>
</template>

<script>
import auth from '../auth';
import HomePage from './Home';

export default {
  name: 'login',
  components: {
    HomePage
  },
  data() {
    return {
      user: {
        username: '',
        password: '',
      },
      invalidCredentials: false,
    };
  },
  methods: {
    login() {
      fetch(`${process.env.VUE_APP_REMOTE_API}/login`, {
        method: 'POST',
        headers: {
          Accept: 'application/json',
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(this.user),
        
      })
        .then((response) => {
          if (response.ok) {
            return response.text();
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
            this.$router.push('/welcome');
          }
        })
        .catch((err) => console.error(err));
    },
    
  },
};
</script>

<style>

#login-submit-button {
    display: flex;
    align-items: flex-end;
    max-width: 100px;
}

#registration-reroute {
    display: flex;
    justify-content: left;
    align-items: flex-end;
}

#password-reset {
    display: flex;
    justify-content: left;
    align-items: flex-end;
}

</style>
