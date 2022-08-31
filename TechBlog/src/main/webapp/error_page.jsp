<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Sorry! Something went wrong.</title>
	
	<!-- CSS CDN -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<style>
	
	</style>
</head>
<body>
	<div class="container text-center">
		<img src="img/warning.png" class="image-fluid mt-5" style="height:100px" >
		<h3 class="diplay-3">Sorry! Something went wrong.</h3>
	
		<h4><%= exception %></h4>
		
		<a href="index.jsp" class="btn primary-background btn-md text-white mt-3">Home</a>
	</div>

</body>
</html>