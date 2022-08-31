<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.sql.*" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Home Page</title>

	<!-- CSS CDN -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<style>
		.banner-background{
			clip-path: polygon(30% 0%, 70% 0%, 100% 0, 100% 95%, 69% 100%, 30% 96%, 0 100%, 0 0);
		}
	</style>
	
	</head>
	<body>
	
	<!-- navbar -->
	<%@ include file="navbar.jsp" %>
	
	<!-- banner -->
	
	<div class="container-fluid p-0 m-0 banner-background">
		<div class="jumbotron primary-background text-white">
			<div class="container">
				<h2 class="display-4">Welcome to TechBlog....</h2>
				
				<p>A programming language is any set of rules that converts strings, or graphical program elements in the case of visual programming languages, to various kinds of machine code output. </p>
				<p>Programming languages are one kind of computer language, and are used in computer programming to implement algorithms.</p>
				
				<button class="btn btn-outline-light btn-lg"><span class="fa fa-user-plus"></span> Start Here</button>
				<a href="login_page.jsp" class="btn btn-outline-light btn-lg"><span class="fa fa-user-circle-o fa-spin"></span> Login</a>
			</div>
		</div>
	
	</div>	
	
	<!-- cards -->
	
	<div class="container">
		<div class="row mb-3">
		
			<div class="col-md-4">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">Java Programming</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn primary-background text-white">read more..</a>
			  </div>
			</div>
			</div>
			
			<div class="col-md-4">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">Java Programming</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn primary-background text-white">read more..</a>
			  </div>
			</div>
			</div>
			
			<div class="col-md-4">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">Java Programming</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn primary-background text-white">read more..</a>
			  </div>
			</div>
			</div>
			
		</div>
		
		<div class="row">
		
			<div class="col-md-4">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">Java Programming</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn primary-background text-white">read more..</a>
			  </div>
			</div>
			</div>
			
			<div class="col-md-4">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">Java Programming</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn primary-background text-white">read more..</a>
			  </div>
			</div>
			</div>
			
			<div class="col-md-4">
			<div class="card">
			  <div class="card-body">
			    <h5 class="card-title">Java Programming</h5>
			    <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
			    <a href="#" class="btn primary-background text-white">read more..</a>
			  </div>
			</div>
			</div>
			
		</div>
	</div>
	
	
	
	
	
	
	
	<!-- javascript cdn -->
	<script src="https://code.jquery.com/jquery-3.6.1.min.js" integrity="sha256-o88AwQnZB+VDvE9tvIXrMQaPlFFSUTR+nldQm1LuPXQ=" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
	<script src="js/myjs.js" type="text/javascript"></script>
	
	
	<script>
		
	</script>

	</body>
</html>