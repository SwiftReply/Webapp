<template>
    <div class="nab">
        <nav class="navbar navbar-expand-sm navbar-dark">
            <router-link to="/Home"> <a class="navbar-brand" style="color:white;text-decoration: none;">Swift Reply</a></router-link>
  <ul class="navbar-nav">
    
    <li class="nav-item active">
      <router-link to="/Home"><a class="nav-link" style="color:white;text-decoration:none;">Home</a></router-link>
    </li>
    <li class="nav-item">
      <router-link to="/MyQuestions"><a class="nav-link" style="color:white;text-decoration:none;">My Questions</a></router-link>
    </li>
  </ul>
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
      <router-link to="/Login"   v-on:click.native="logout()" replace><a class="nav-link" style="color:white;text-decoration: none;">Log out</a></router-link>
      </li>
    </ul>
</nav>

<div class="footer">
          <span id="copyright">All Rights Reserved &copy; </span>  
      </div>
    </div>
</template>


<script>


export default {
    name: 'Nav',
    mounted(){
        document.getElementById('copyright').appendChild(document.createTextNode(new Date().getFullYear()));
    },
    methods:{
      logout(){
        this.authenticated = false;
      }
    }
}
</script>
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto);

.nab{
  font-family: 'Roboto', sans-serif;;
  background-color: #001489;
  
  
}

.footer {
  font-family: 'Roboto', sans-serif;;
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: #001489;
  color: white;
  text-align: center;
  
  
  
}


</style>