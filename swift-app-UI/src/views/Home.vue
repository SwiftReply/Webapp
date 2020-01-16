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

  <div class="row col-md-12 homecontent" style="margin:2px;">
  <div class="myBox col-md-7">
    <h1>Questions Related to You</h1>
    <div Class="Questions">
      <div class="card">
            <a href="" >How to set value for a field of one list of object from another list of object having a common field?</a>
            <Span style="font: 12px 'Roboto', sans-serif;font-weight:bold;">Asked 29 Dec'19 by <a href="">USERNAME</a></Span>
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
  
  <div class="row col-md-12 searchbarresult" style="margin:2px;">

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




.searchbar
{
  font-family: "Roboto", sans-serif;
  border: none;
  
  
}

.filter
{
  color: #001489;
  font-family: "Roboto", sans-serif;
  margin-right: 5px;
  height: 30px;
  outline: 0;
  border: 0;
  background: #f2f2f2;
  box-sizing: border-box;
  font-size: 14px;
}



.searchbartext
{
  color: #001489;
  font-family: "Roboto", sans-serif;
  margin-right: 5px;
  padding: 15px;
  height: 30px;
  outline: 0;
  border: 0;
  background: #f2f2f2;
  box-sizing: border-box;
  font-size: 14px;
}


.button
{
  font-family: "Roboto", sans-serif;
  font-weight: bolder;
  text-transform: uppercase;
  outline: 0;
  background: #ffc72c;
  width: 100%;
  border: 0;
  height: 30px;
  color: #001489;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer;
  margin-right: 16px;
}

.searchbutton
{
  font-family: "Roboto", sans-serif;
  font-weight: bolder;
  text-transform: uppercase;
  outline: 0;
  background: #ffc72c;
  width: 100%;
  border: 0;
  height: 30px;
  color: #001489;
  font-size: 14px;
  -webkit-transition: all 0.3 ease;
  transition: all 0.3 ease;
  cursor: pointer; 

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

  color: #001489;
  font-family: "Roboto", sans-serif;
  margin-right: 5px;
  padding: 15px;
  outline: 0;
  border: 0;
  background: #f2f2f2;
  box-sizing: border-box;
  font-size: 14px;

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
  color: #001489;
  font-family: "Roboto", sans-serif;
  margin-right: 5px;
  padding: 15px;
  outline: 0;
  border: 0;
  background: #f2f2f2;
  box-sizing: border-box;
  font-size: 14px;
  margin-bottom: 2px;
  
}

.card a {
  color: #001489;
  font-family: "Roboto", sans-serif;
  margin-bottom:5px;
  text-decoration:none;
}

.searchbarresult{
  display: none;

}
</style>