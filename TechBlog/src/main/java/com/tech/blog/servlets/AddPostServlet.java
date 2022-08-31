package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import com.tech.blog.dao.PostDao;
import com.tech.blog.entities.Post;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

@MultipartConfig
public class AddPostServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		int cid = Integer.parseInt(request.getParameter("cid"));
		String pTitle = request.getParameter("pTitle");
		String pContent = request.getParameter("pContent");
		String pCode = request.getParameter("pCode");
		Part part = request.getPart("pic");
		
		// getting current user id
		
		HttpSession session = request.getSession();
		User user = (User) session.getAttribute("currentUser");
		
		Post p = new Post(pTitle,pContent,pCode,part.getSubmittedFileName(),null,cid,user.getId());
		
		PostDao dao = new PostDao(ConnectionProvider.getConnection());
		if(dao.savePost(p)) {
			out.println("done");
			
			
		}
		else
		{
			out.println("error");
		}
		
		
//		out.println("your post title is "+ pTitle);
//		out.println(part.getSubmittedFileName());
	}

}
