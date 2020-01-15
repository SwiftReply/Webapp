<template>
    <div class="nab">
        <nav class="navbar navbar-expand-sm navbar-dark">
            <router-link to="/Home"> <a class="navbar-brand" style="color:#001489;text-decoration: none;">Swift Reply</a></router-link>
  <ul class="navbar-nav">
    
    <li class="nav-item active">
      <router-link to="/Home"><a class="nav-link" style="color:#001489;text-decoration:none;">Home</a></router-link>
    </li>
    <li class="nav-item">
      <router-link to="/MyQuestions"><a class="nav-link" style="color:#001489;text-decoration:none;">My Questions</a></router-link>
    </li>
  </ul>
    <ul class="navbar-nav ml-auto">
      <li class="nav-item">
      <router-link to="/Login"   v-on:click.native="logout()" replace><a class="nav-link" style="color:#001489;text-decoration: none;">Log out</a></router-link>
      </li>
    </ul>
</nav>

    </div>
</template>


<script>


export default {
    name: 'Nav',
    
    methods:{
      logout(){
        this.authenticated = false;
      }
    }
}
</script>
<style>
@import url(https://fonts.googleapis.com/css?family=Raleway);

.nab{
  font-family: "Raleway", sans-serif;
  background-color: #ffc72c;
  font-weight: Bold
  
}


</style>