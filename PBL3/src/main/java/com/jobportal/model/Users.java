package com.jobportal.model;

public class Users {
	
	private int id;
	private String uname;
	private String upwd;
	private String uemail;
	private String umobile;
	
	public Users() {
		super();
	}

	public Users(int id, String uname, String upwd, String uemail, String umobile) {
		super();
		this.id = id;
		this.uname = uname;
		this.upwd = upwd;
		this.uemail = uemail;
		this.umobile = umobile;
	}
	
	public Users(String uname, String upwd, String uemail, String umobile) {
		super();
		this.uname = uname;
		this.upwd = upwd;
		this.uemail = uemail;
		this.umobile = umobile;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getUemail() {
		return uemail;
	}

	public void setUemail(String uemail) {
		this.uemail = uemail;
	}

	public String getUmobile() {
		return umobile;
	}

	public void setUmobile(String umobile) {
		this.umobile = umobile;
	}
	
	
}
