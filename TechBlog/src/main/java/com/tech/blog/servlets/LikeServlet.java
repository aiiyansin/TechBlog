package com.tech.blog.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tech.blog.dao.LikeDao;
import com.tech.blog.helper.ConnectionProvider;

public class LikeServlet extends HttpServlet {
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String operation = request.getParameter("operation");
		int uid = Integer.parseInt(request.getParameter("uid"));
		int pid = Integer.parseInt(request.getParameter("pid"));
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
//		out.println("data from server");
//		out.println(operation);
//		out.println(uid);
//		out.println(pid);
		
		LikeDao ldao = new LikeDao(ConnectionProvider.getConnection());
		
		if(operation.equals("like")){
			boolean f = ldao.insertLike(pid, uid);
			out.println(f);
		}
	}

}
