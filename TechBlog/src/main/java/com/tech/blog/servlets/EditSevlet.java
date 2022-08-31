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

import com.tech.blog.dao.UserDao;
import com.tech.blog.entities.User;
import com.tech.blog.helper.ConnectionProvider;

@MultipartConfig
public class EditSevlet extends HttpServlet {
//	private static final long serialVersionUID = 102831973239L;
       
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
    	response.setContentType("text/html");
    	PrintWriter out =  response.getWriter();
    	
    	out.println("editServlet");
    	
    	// fetch all data from request
    	
    	String userEmail = request.getParameter("user_email");
    	String userName = request.getParameter("user_name");
    	String userPassword = request.getParameter("user_password");
    	String userAbout = request.getParameter("user_about");
    	
    	Part part = request.getPart("image");
    	String imageName = part.getSubmittedFileName();
    	
    	// get the user from session...
    	
    	HttpSession s = request.getSession();
    	User user = (User)s.getAttribute("currentUser");
    	
    	user.setEmail(userEmail);
    	user.setName(userName);
    	user.setPassword(userPassword);
    	user.setAbout(userAbout);
    	user.setProfile(imageName);
    	
    	// update database...
    	UserDao userDao = new UserDao(ConnectionProvider.getConnection());
    	
    	boolean flag = userDao.updateUser(user);
    	
    	if(flag) {
    		out.println("Updated..");
    	}
    	else {
			out.println("Not Updated..");
		}
    	
	}

}
