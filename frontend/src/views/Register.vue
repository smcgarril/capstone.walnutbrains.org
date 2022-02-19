<template>
  <div id="register" class="text-center">
    <form class="form-register" @submit.prevent="register">
      <div class="alert alert-danger" role="alert" v-if="registrationErrors">
        There were problems registering this user.
      </div>

      <div class="columns is-centered">
        <div class="column is-half" id="register-col">
          <div class="field">
            <label for="userame" class="label sr-only">Username</label>
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

          <div class="field">
            <label for="firstname" class="label sr-only">First Name</label>
            <div class="control">
              <input
                type="text"
                id="firstname"
                class="input form-control"
                placeholder="First Name"
                v-model="user.firstName"
                required
                autofocus
              />
              </div>
          </div>

          <div class="field">
            <label for="lastname" class="label sr-only">Last Name</label>
            <div class="control">
              <input
                type="text"
                id="lastname"
                class="input form-control"
                placeholder="Last Name"
                v-model="user.lastName"
                required
                autofocus
              />
            </div>
          </div>

          <div class="field">
            <label class="label sr-only">Email</label>
            <div class="control">
              <input 
                class="input form-control" 
                type="email" 
                id="email" 
                placeholder="Email"
                v-model="user.email"
                required
                autofocus
              />
            </div>
          </div>    

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

          <div class="field">
            <label for="password" class="label password sr-only">Confirm Password</label>
            <div class="control">  
              <input
                type="password"
                id="confirmPassword"
                class="input form-control"
                placeholder="Confirm Password"
                v-model="user.confirmPassword"
                required
              />
            </div>
          </div>

          <!-- <div class="field">
            <label for="securityQuestion" class="label sr-only">Security Question</label>
            <div class="control">  
              <select
                type="text"
                id="securityQuestion"
                class="input form-control"
                placeholder="Security Question"
                v-model="user.securityQuestion"
                required>
                <option>What is the name of your favorite childhood friend?</option>
                <option>What is your oldest sibling's middle name?</option>
                <option>What is your maternal grandmother's maiden name?</option>
                <option>What is the name of a college you applied to but didn't attend?</option>
                <option>What was your dream job as a child?</option>
                <option>What was the make and model of your first car?</option>
              </select>
            </div>
          </div>

          <div class="field">
            <label for="securityAnswer" class="label sr-only">Your Answer</label>
            <div class="control">  
              <input
                type="text"
                id="securityAnswer"
                class="input form-control"
                placeholder="Your Answer"
                v-model="user.securityAnswer"
                required
              />
            </div>
          </div> -->

          <div class="field">
            <label for="category1" class="label sr-only">Category 1</label>
            <div class="control">  
              <select
                type="text"
                id="category1"
                class="input form-control"
                placeholder="Category 1"
                v-model="user.category1"
                autofocus>
                <option>Art</option>
                <option>Food</option>
                <option>History</option>
                <option>Local</option>
                <option>Nature</option>
                <option>Sports</option>
              </select>
            </div>
          </div>

          <div class="field">
            <label for="category2" class="label sr-only">Category 2</label>
            <div class="control">  
              <select
                type="text"
                id="category1"
                class="input form-control"
                placeholder="Category 2"
                v-model="user.category2"
                autofocus>
                <option>Art</option>
                <option>Food</option>
                <option>History</option>
                <option>Local</option>
                <option>Nature</option>
                <option>Sports</option>
              </select>
            </div>
          </div>

          <div class="field">
            <label for="neighborhood1" class="label sr-only">Neighborhood 1</label>
            <div class="control">  
              <select
                type="text"
                id="category1"
                class="input form-control"
                placeholder="Neighborhood 1"
                v-model="user.neighborhood1"
                autofocus>
                <option>Downtown</option>
                <option>Lawrenceville</option>
                <option>Mt. Washington</option>
                <option>Northside</option>
                <option>Point Breeze</option>
                <option>Oakland</option>
                <option>Strip District</option>
                <option>Squirrel Hill</option>
              </select>
            </div>
          </div>

          <div class="field">
            <label for="neighborhood2" class="label sr-only">Neighborhood 2</label>
            <div class="control">  
              <select
                type="text"
                id="category1"
                class="input form-control"
                placeholder="Neighborhood 2"
                v-model="user.neighborhood2"
                autofocus>
                <option>Downtown</option>
                <option>Lawrenceville</option>
                <option>Mt. Washington</option>
                <option>Northside</option>
                <option>Point Breeze</option>
                <option>Oakland</option>
                <option>Strip District</option>
                <option>Squirrel Hill</option>
              </select>
            </div>
          </div>

          <div class="field is-grouped">
            <div class="control">
              <button class="button is-link">Submit</button>
            </div>
            <div class="control">
              <button class="button is-link is-light">Cancel</button>
            </div>
          </div>
        </div>
      </div>

    </form>
  </div>
</template>

<script>
export default {
  name: 'register',
  data() {
    return {
      user: {
        username: '',
        firstName: '',
        lastName: '',
        email: '',
        password: '',
        confirmPassword: '',
        role: 'user',
        category1: '',
        category2: '',
        neighborhood1: '',
        neighborhood2: ''
      },
      registrationErrors: false,
    };
  },
  methods: {
    register() {
      let d = JSON.stringify(this.user);
      console.log(d);
      fetch(`${process.env.VUE_APP_REMOTE_API}/register`, {
        method: 'POST',
        headers: {
          Accept: 'application/json',
          'Content-Type': 'application/json',
        },
        body: JSON.stringify(this.user),
      })
        .then((response) => {
          if (response.ok) {
            this.$router.push({ path: '/login', query: { registration: 'success' } });
          } else {
            this.registrationErrors = true;
          }
        })

        .then((err) => console.error(err));
    },
  },
};
</script>

<style>

#register-col {
  margin-bottom: 20px;
}

input {
  margin: 5px;
  padding: 5px;
}

button {
  margin: 5px;
  padding: 5px;
}
</style>
