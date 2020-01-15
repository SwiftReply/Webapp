<template>
  <div class="home">
    <Nav/>
    <br/>
    <div class="searchbar col-md-12">
    <select name="Filter" class="filter col-md-2">
    <option value="JAVA">JAVA</option>
    <option value=".NET">.NET</option>
    <option value="Oracle Fomrs">Oracle Fomrs</option>
    <option value="Generic">Generic</option>
  </select>
       
    <input type="text" placeholder="Search.." name="search" class="searchbartext col-md-6">
    
      <button type="submit" class="searchbutton col-md-2">Search</button>
      </div>

      <hr/>

      <br/>

  <div class="row col-md-12" style="margin:2px;">
  <div class="myBox col-md-7">
    <h1>Questions Related to You</h1>
    <div Class="Questions">
      <div class="card">
            <span style="margin-bottom:5px">How to set value for a field of one list of object from another list of object having a common field?</span>
            
            <Span style="font: 12px 'Roboto', sans-serif;font-weight:bold;">Asked 29 Dec'19 by USERNAME</Span>
      </div>
      
      
      </div>  
    

      
  </div>

  <div class="vl col-md-1"></div>
  <div class="col-md-4" style="float:left">
     
    <div Class="QuestionArea">
      <p class="usernametag"><span class="glyphicon glyphicon-user"></span>User Name</p>
      <textarea rows="13" cols="50" placeholder="What is Your Question?">
      </textarea>
      <div>
        <button type="submit" class="button col-md-2 ">Ask</button>
      <button type="Reset" class="button col-md-2">Clear</button>

      </div>
      </div>
  </div>

  </div>  


  <div class="footer">
          <span >All Rights Reserved &copy; 2020
           
             </span> 
      </div>
    
  </div>
  

</template>
<script>
import Nav from '../components/Nav';
export default {
  name: 'home',
  components: {
    Nav
  }
}


</script>
<style>
@import url(https://fonts.googleapis.com/css?family=Roboto:300);

.footer {
  font-family: "Roboto", sans-serif;
  position: fixed;
  left: 0;
  bottom: 0;
  width: 100%;
  background-color: #ffc72c;
  color: #001489;
  text-align: center;
  font-weight: bold;
}


.searchbar
{
  font-family: "Roboto", sans-serif;
  border: none;
  
}

.filter
{
  color: #001489;
  border-radius: 5px;
  border-style: solid;
  border-color: #001489;
  border-width: 0.5px;
  margin-right: 5px;
  height: 30px;
}



.searchbartext
{
  color: #001489;
  border-radius: 5px;
  border-style: solid;
  border-color: #001489;
  border-width: 0.5px;
  margin-right: 5px;
  height: 30px;
}


.button
{
  color: #001489;
  background-color: #ffc72c;
  border-radius: 5px;
  border-style: solid;
  border-width: 0.2px;
  border-color: #001489;
  margin-right: 16px;
}

.searchbutton
{
  color: #001489;
  background-color: #ffc72c;
  border-radius: 5px;
  border-style: solid;
  border-width: 0.2px;
  border-color: #001489;
  margin-right: 16px;
  height: 30px;  

}

hr {
    display: block;
    height: 1px;
    border: 0;
    border-top: 1px solid #ffc72c;
    margin: 1em 0;
    padding: 0;
}

.usernametag
{
  color: #001489;
  font-family: "Roboto", sans-serif;
  text-align: left;
}

.QuestionArea
{
  font-family: "Roboto", sans-serif;
  color: #001489;
  margin :0px;
  float: left;
  
}

textarea
{

border-radius: 5px;
  border-style: solid;
  border-color: #001489;
  border-width: 0.5px;

}


.myBox {
border: none;
padding: 5px;
font: 16px "Roboto", sans-serif;
width: 200px;
height: 400px;
overflow: scroll;

font-family: "Roboto", sans-serif;
color: #001489;

}

/* Scrollbar styles */
::-webkit-scrollbar {
width: 12px;
height: 12px;
}

::-webkit-scrollbar-track {
border: 1px solid #ffc72c;
border-radius: 10px;
}

::-webkit-scrollbar-thumb {
background: #ffc72c;  
border-radius: 10px;
}

::-webkit-scrollbar-thumb:hover {
background: #ffc72c;  
}

h1
{
  font-family: "Roboto", sans-serif;
  color: #ffc72c;
}

.vl {
  border-left: 3px solid #ffc72c;
  height: 400px;
  margin-left: 50px;
  margin-right: -80px;
  
}

.card{
  text-align: left;
  padding: 10px;
  border-color: #001489;
  
}
</style>