package com.java14.crm.QuanLy.lop;

public class user {
	private int id;
	private String email;
	private String password;
	private String fullName;
	private String avatar;
	private int role_id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the fullName
	 */
	public String getFullName() {
		return fullName;
	}
	/**
	 * @param fullName the fullName to set
	 */
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	/**
	 * @return the avatar
	 */
	public String getAvatar() {
		return avatar;
	}
	/**
	 * @param avatar the avatar to set
	 */
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	/**
	 * @return the role_id
	 */
	public int getRole_id() {
		return role_id;
	}
	/**
	 * @param role_id the role_id to set
	 */
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	/**
	 * @param id
	 * @param email
	 * @param password
	 * @param fullName
	 * @param avatar
	 * @param role_id
	 * @param task_id
	 */
	public user(int id, String email, String password, String fullName, String avatar, int role_id) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.fullName = fullName;
		this.avatar = avatar;
		this.role_id = role_id;
	}
	
	public user() {
		
	}
	
	public void xuat() {
		System.out.println("ID. "+this.id+
				" Họ và tên: "+this.fullName+
				" Email: "+this.email);	
	}
}
