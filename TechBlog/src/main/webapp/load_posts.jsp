<%@page import="com.tech.blog.entities.User"%>
<%@page import="com.tech.blog.dao.LikeDao"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.tech.blog.entities.Post"%>
<%@page import="java.util.List"%>
<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@page import="com.tech.blog.dao.PostDao"%>

<div class="row">

<%
	
	User user = (User)session.getAttribute("currentUser");

	PostDao d = new PostDao(ConnectionProvider.getConnection());
	
	int cid = Integer.parseInt(request.getParameter("cid"));
	List<Post> posts = new ArrayList<>();
	posts = d.getAllPosts();
	
	
	if(cid == 0){
		posts = d.getAllPosts();
	}
	else{
		posts = d.getPostByCatId(cid);
	}
	
	if(posts.size() == 0){
		out.println("<h4 class='display-4 text-center'>No posts in this category..</h4>");
		return;
	}
	
	
	for(Post p : posts){
		
%>

	<div class="col-md-6 mt-2">
		<div class="card">
			<img class="card-img-top" src="post_pics/<%= p.getPpic() %>" alt="post img here"> 
			<div class="card-body">
				<b><%= p.getPtitle() %></b>
				<p><%= p.getPcontent() %></p>
			</div>
			<div class="card-footer primary-background">
			
				<%
						LikeDao ldd = new LikeDao(ConnectionProvider.getConnection());
					
				%>
				<a href="show_post.jsp?post_id=<%= p.getPid() %>" class="btn btn-outline-light btn-sm">Read More..</a>
				<a href="#" onclick="doLike(<%= p.getPid() %>, <%= p.getUserid() %>)" class="btn btn-outline-light btn-sm"><i class="fa fa-thumbs-o-up"></i><span class="like-counter"><%= ldd.countLikeOnPost(p.getPid()) %></span></a>
				<a href="#" class="btn btn-outline-light btn-sm"><i class="fa fa-commenting-o"></i><span>20</span></a>
			</div>
		
		</div>
	
	</div>

<%
	}
%>
</div>	