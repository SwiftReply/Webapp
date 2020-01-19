<template>
  <div class="home">
    <Nav/>
    <br/>
    <div class="searchbar col-md-12">
    <select name="Filter" class="filter col-md-2">
    <option value="JAVA">JAVA</option>
    <option value=".NET">.NET</option>
    <option value="Oracle Forms">Oracle Fomrs</option>
    <option value="Generic">Generic</option>
  </select>
       
    <input type="text" placeholder="Search.." name="search" class="searchbartext col-md-5">
    
      <button type="submit" class="searchbutton col-md-1">Search</button>
      <button type="submit" class="quebtn col-md-2" data-toggle="modal" data-target="#myModal">Ask Question</button>
      </div>

      <hr/>

      <br/>

  <div class="homecontent row col-md-12 justify-content-center">
          
  <div class="myBox col-md-10">
    <h1>Questions Related to You</h1>
    <div Class="Questions" >
      <div class="card">
            <a class="questiondetail">How to set value for a field of one list of object from another list of object having a common field?</a>
            <Span style="font: 12px 'Roboto', sans-serif;font-weight:bold;">Asked 29 Dec'19 by <a href="">USERNAME</a></Span>
      </div>
      </div>  
  </div>
  </div>


  <div class="modal fade" id="myModal">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <div class="modal-title usernametag chip">
                <v-icon name="user" scale="2"  style="margin-right:10px"/>John Doe
          </div>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          	
      		<textarea rows="13" cols="50" placeholder="What is Your Question?">
      		</textarea>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
          <select name="TechnologyFilter" class="technologytag col-md-3">
              <option value="JAVA">JAVA</option>
              <option value=".NET">.NET</option>
              <option value="Oracle Forms">Oracle Forms</option>
              <option value="Generic">Generic</option>
          </select>
        	<button type="submit" class="button col-md-2 ">Ask</button>
      		<button type="button" class="button col-md-2" data-dismiss="modal">Close</button>
          
        </div>
        
      </div>
    </div>
  </div>
  
  <div class="row col-md-12 searchbarresult" style="margin:2px;">

  </div>

  <div class="Questionclick row col-md-12 justify-content-center">
    <div class="questionwithcomment col-md-12">
      <div class="card">
            <h4>Question</h4>
            <a role="button" class="questiondetail">How to set value for a field of one list of object from another list of object having a common field?</a>
            <div>
            <Span  style="font: 14px 'Roboto', sans-serif;font-weight:bolder;">Asked 29 Dec'19 by <a href="">USERNAME</a></Span>
            <Span class="col-md-2" style="font: 14px 'Roboto', sans-serif;font-weight:bolder;"><a  role="button"  data-toggle="modal" data-target="#myModal1">Add a Comment</a></span>
            </div>
            <hr/>
            <h4>Comments</h4>
            <div class="card" style="background: #e4e6e8">
              <span class="questiondetail" style="font-size:16px;margin-bottom:5px">This is a Comment   </span>
              <Span style="font: 14px 'Roboto', sans-serif;font-weight:bolder;">Commented 29 Dec'19 by <a href="">USERNAME</a></Span>
            </div>
            <hr/>
            <button type="submit" class="button backbtn col-md-2">Back</button>
  <div class="modal fade" id="myModal1">
    <div class="modal-dialog">
      <div class="modal-content">
      
        <!-- Modal Header -->
        <div class="modal-header">
          <div class="modal-title usernametag chip">
                <v-icon name="user" scale="2"  style="margin-right:10px"/>John Doe
          </div>
          <button type="button" class="close" data-dismiss="modal">&times;</button>
        </div>
        
        <!-- Modal body -->
        <div class="modal-body">
          	
      		<textarea rows="13" cols="50" placeholder="Add your Comment">
      		</textarea>
        </div>
        
        <!-- Modal footer -->
        <div class="modal-footer">
        	<button type="submit" class="button col-md-2">Add</button>
      		<button type="button" class="button col-md-2" data-dismiss="modal">Close</button>
          
        </div>
        
      </div>
    </div>
  </div>
            
              
            
      </div>
    </div>
  </div>
    
  </div>
  

</template>
<script>
import Nav from '../components/Nav'
import constant from '../Util/constant'
import axios from 'axios'

export default {
  name: 'home',
  mounted(){
        $(document).ready(function(){
    $(".questiondetail").click(function(){
        $(".Questionclick").show();
       $(".homecontent").hide();

    });

});

$(document).ready(function(){
    $(".backbtn").click(function(){
        $(".homecontent").show();
       $(".Questionclick").hide();

    });

});
    },
  components: {
    Nav
  },
  created(){
    this.getAllQuestion()
  },
  methods:{
    getAllQuestion(){
      axios.get(constant.baseURL+'/'+constant.serviceURL.getAllQuestion).then(response => {
        console.log(response)
      }).catch(error =>{
        console.log(error)
      })
    },
    
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

.technologytag
{
  color: #001489;
  font-family: "Roboto", sans-serif;
  margin-right: 16px;
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
  font-weight: bold-condensed;
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
  font-weight: bold-condensed;
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
  margin-right: 5px;
  

}

.quebtn{
  font-family: "Roboto", sans-serif;
  font-weight: bold-condensed;
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
  margin-right: 0px;
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
  margin-left: 20px;
  margin-right: -100px;
  
}

.card{
  text-align: left;
  padding: 10px;
  color: #001489;
  font-family: "Roboto", sans-serif;
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
  font-size: 16px;
}

.chip {
  display: inline-block;
  padding: 0 25px;
  height: 50px;
  font-size: 16px;
  line-height: 50px;
  border-radius: 25px;
  background-color: #f1f1f1;
}

.chip img {
  float: left;
  margin: 0 10px 0 -25px;
  height: 50px;
  width: 50px;
  border-radius: 50%;
}

.searchbarresult{
  display: none;

}

.Questionclick{
  display: none;
}

</style>