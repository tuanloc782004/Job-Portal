package com.jobportal.model;

public class UsersDetail {
	
	private int idUser;
	private String category;
	private String country;
	private String workExperience;
	private String education;
	private String professionalSkills;
	private String img;
	
	public UsersDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UsersDetail(int idUser, String category, String country, String workExperience, String education,
			String professionalSkills, String img) {
		super();
		this.idUser = idUser;
		this.category = category;
		this.country = country;
		this.workExperience = workExperience;
		this.education = education;
		this.professionalSkills = professionalSkills;
		this.img = img;
	}

	public int getIdUser() {
		return idUser;
	}

	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getWorkExperience() {
		return workExperience;
	}

	public void setWorkExperience(String workExperience) {
		this.workExperience = workExperience;
	}

	public String getEducation() {
		return education;
	}

	public void setEducation(String education) {
		this.education = education;
	}

	public String getProfessionalSkills() {
		return professionalSkills;
	}

	public void setProfessionalSkills(String professionalSkills) {
		this.professionalSkills = professionalSkills;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}
	
}
