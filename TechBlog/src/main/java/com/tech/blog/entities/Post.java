package com.tech.blog.entities;

import java.sql.Timestamp;

public class Post {
	
	private int pid;
	private String ptitle;
	private String pcontent;
	private String pcode;
	private String ppic;
	private Timestamp pDate;
	private int cid;
	private int userid;
	
	public Post() {
		
	}
	public Post(int pid, String ptitle, String pcontent, String pcode, String ppic, Timestamp pDate, int cid,int userid) {
		
		this.pid = pid;
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.pDate = pDate;
		this.cid = cid;
		this.userid = userid;
	}
	public Post(String ptitle, String pcontent, String pcode, String ppic, Timestamp pDate, int cid,int userid) {
	
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.pDate = pDate;
		this.cid = cid;
		this.userid = userid;
	}
	
	
	
	public Post(int pid, String ptitle, String pcontent, String pcode, String ppic, Timestamp pDate, int userid) {
		super();
		this.pid = pid;
		this.ptitle = ptitle;
		this.pcontent = pcontent;
		this.pcode = pcode;
		this.ppic = ppic;
		this.pDate = pDate;
		this.userid = userid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPtitle() {
		return ptitle;
	}
	public void setPtitle(String ptitle) {
		this.ptitle = ptitle;
	}
	public String getPcontent() {
		return pcontent;
	}
	public void setPcontent(String pcontent) {
		this.pcontent = pcontent;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPpic() {
		return ppic;
	}
	public void setPpic(String ppic) {
		this.ppic = ppic;
	}
	public Timestamp getpDate() {
		return pDate;
	}
	public void setpDate(Timestamp pDate) {
		this.pDate = pDate;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
}
