package com.tech.blog.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.tech.blog.entities.Category;
import com.tech.blog.entities.Post;

public class PostDao {
	
	Connection con;

	public PostDao(Connection con) {
		this.con = con;
	}
	
	public ArrayList<Category> getAllCategories(){
		
		ArrayList<Category> list = new ArrayList<>();
		
		
		try {
			
			String q = "select * from categories";
			
			Statement st = this.con.createStatement();
			ResultSet set = st.executeQuery(q);
			
			while(set.next()) {
				
				int cid = set.getInt("cid");
				String name = set.getString("name");
				String description = set.getString("description");
				
				Category c = new Category(cid,name,description);
				list.add(c);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public boolean savePost(Post p) {
		boolean f = false;
		
		try {
			
			String q = "insert into posts(ptitle,pcontent,pcode,ppic,cid,userid) values(?,?,?,?,?,?)";
			
			PreparedStatement pstmt = con.prepareStatement(q);
			
			pstmt.setString(1, p.getPtitle());
			pstmt.setString(2, p.getPcontent());
			pstmt.setString(3, p.getPcode());
			pstmt.setString(4, p.getPpic());
			pstmt.setInt(5, p.getCid());
			pstmt.setInt(6, p.getUserid());
			
			pstmt.executeUpdate();
			f=true;
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return f;
	}
	
	public List<Post> getAllPosts(){
		List<Post> list = new ArrayList<>();
		
		// fetch all posts
		
		try {
			
			String q = "select * from posts order by pdate desc";
			PreparedStatement pstmt = con.prepareStatement(q);
			
			ResultSet set = pstmt.executeQuery();
			
			while(set.next()) {
				
				int pId = set.getInt("pid");
				String pTitle = set.getString("ptitle");
				String pContent = set.getString("pcontent");
				String pCode = set.getString("pcode");
				String pPic = set.getString("ppic");
				Timestamp date = set.getTimestamp("pdate");
				int catId = set.getInt("cid");
				int userId = set.getInt("userid");
				
				Post p = new Post(pId,pTitle,pContent,pCode,pPic,date,catId,userId);
				
				list.add(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public List<Post> getPostByCatId(int catId){
		List<Post> list = new ArrayList<>();
		
		// fetch all posts by id
		
		try {
			
			String q = "select * from posts where cid=?";
			PreparedStatement pstmt = con.prepareStatement(q);
			pstmt.setInt(1, catId);
			
			ResultSet set = pstmt.executeQuery();
			
			while(set.next()) {
				
				int pId = set.getInt("pid");
				String pTitle = set.getString("ptitle");
				String pContent = set.getString("pcontent");
				String pCode = set.getString("pcode");
				String pPic = set.getString("ppic");
				Timestamp date = set.getTimestamp("pdate");
				int userId = set.getInt("userid");
				
				Post p = new Post(pId,pTitle,pContent,pCode,pPic,date,catId,userId);
				
				list.add(p);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	public Post getPostByPostId(int postId)
	{
		Post post = null;
		String q = "select * from posts where pid=?";
		
		try {
			PreparedStatement p = this.con.prepareStatement(q);
			p.setInt(1, postId);
			
			ResultSet set = p.executeQuery();
			
			if(set.next()) {
				
				int pId = set.getInt("pid");
				String pTitle = set.getString("ptitle");
				String pContent = set.getString("pcontent");
				String pCode = set.getString("pcode");
				String pPic = set.getString("ppic");
				Timestamp date = set.getTimestamp("pdate");
				int userId = set.getInt("userid");
				int cId = set.getInt("cid");
				
				post = new Post(pId,pTitle,pContent,pCode,pPic,date,cId,userId);
				
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return post;
	}
}
