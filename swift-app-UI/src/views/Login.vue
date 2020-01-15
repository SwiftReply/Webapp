<template>
    <div class="Login">
        
        <div class="login-page">
  <div class="form">
    
    <form class="login-form">
      <input type="text" v-model="input.username" placeholder="Username"/>
      <input type="password" v-model ="input.password" placeholder="Password"/>
      <button type="button" @click="login()">login</button>
      <br/> 
      <span >{{message}}</span>
    </form>
  </div>
</div>
    </div>
</template>
<script>
import axios from 'axios'
export default {
  name: 'Login',
  components: {
  },
  data () {
            return {
                message: "",
                input: {
                    username: "",
                    password: "",
                },
                response: ""
            }
        },
  
  methods: {
    login() {
      
      if(this.input.username != "" && this.input.password != "") {
                    axios.post("https://reqres.in/api/login",{"email": "eve.holt@reqres.in",
    "password": "cityslicka"}).then(response =>{this.response = response.data})
                    if(this.response != null) {
                        this.$emit("authenticated", true);
                        
                        this.$router.replace({ name: "Home" });
                    } else {
                      this.message = "The username and / or password is incorrect";
                        
                    }
                } else {
                    this.message ="A username and password must be present";
                }
                
    }
    
  }
}
</script>
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:300);


.login-page {
  width: 360px;
  padding: 8% 0 0;
  margin: auto;
  
}
.form {
  position: relative;
  z-index: 1;
  background: #FFFFFF;
  max-width: 360px;
  margin: 0 auto 100px;
  padding: 45px;
  text-align: center;
  box-shadow: 0 0 20px 0 rgba(0, 0, 0, 0.2), 0 5px 5px 0 rgba(0, 0, 0, 0.24);
}
.form input {
  font-family: "Roboto", sans-serif;
  outline: 0;
  background: #f2f2f2;
  width: 100%;
  border: 0;
  margin: 0 0 15px;
  padding: 15px;
  box-sizing: border-box;
  font-size: 14px;
}
.form button {
  font-family: "Roboto", sans-serif;
  font-weight: bolder;
  text-transform: uppercase;
  outline: 0;
  background: #ffc72c;
  width: 100%;
  border: 0;
  padding: 15px;
  color: #001489;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
}
.form button:hover,.form button:active,.form button:focus {
  background: #001489;
  color: #ffc72c;
}
.form .message {
  margin: 15px 0 0;
  color: #001489;
  font-size: 12px;
}
.form .message a {
  color: #001489;
  text-decoration: none;
}

.container {
  position: relative;
  z-index: 1;
  max-width: 300px;
  margin: 0 auto;
}
.container:before, .container:after {
  content: "";
  display: block;
  clear: both;
}
.container .info {
  margin: 50px auto;
  text-align: center;
}
.container .info h1 {
  margin: 0 0 15px;
  padding: 0;
  font-size: 36px;
  font-weight: 300;
  color: #001489;
}
.container .info span {
  color: #001489;
  font-size: 12px;
}
.container .info span a {
  color: #001489;
  text-decoration: none;
}
.container .info span .fa {
  color: #001489;
}
body {
  background: #ffffff; /* fallback for old browsers */
  background: -webkit-linear-gradient(right, #ffffff, #ffffff);
  background: -moz-linear-gradient(right, #ffffff, #ffffff);
  background: -o-linear-gradient(right, #ffffff, #ffffff);
  background: linear-gradient(to left, #ffffff, #ffffff);
  font-family: "Roboto", sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;      
}
</style>