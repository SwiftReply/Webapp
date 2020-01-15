<template>
  <div id="app">
    <router-view @authenticated="setAuthenticated"/>
  </div>
</template>


<script>
import Nav from './components/Nav';

export default {
 name : 'app',
 components : {
   
 } ,
 data(){
      return {
        authenticated: false,
        
      }
    },
mounted() {
            if(!this.authenticated) {
                this.$router.replace({ name: "Login" });
            }
        },
        methods: {
            setAuthenticated(status) {
                this.authenticated = status;
            }
        }

}
</script>

<style lang="scss">
#app {
  font-family: 'Avenir', Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
}

#nav {
  padding: 30px;

  a {
    font-weight: bold;
    color: #2c3e50;

    &.router-link-exact-active {
      color: #42b983;
    }
  }
}
</style>
