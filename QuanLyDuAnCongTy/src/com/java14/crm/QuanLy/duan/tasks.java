/**
 * 
 */
package com.java14.crm.QuanLy.duan;

/**
 * @author maichienvithien
 * quản lí dự án
 */
public class tasks {
	private int id;
	private String name;
	private String star_date;
	private String end_date;
	private int user_id;
	private int job_id;
	private int status_id;
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the star_date
	 */
	public String getStar_date() {
		return star_date;
	}
	/**
	 * @param star_date the star_date to set
	 */
	public void setStar_date(String star_date) {
		this.star_date = star_date;
	}
	/**
	 * @return the end_date
	 */
	public String getEnd_date() {
		return end_date;
	}
	/**
	 * @param end_date the end_date to set
	 */
	public void setEnd_date(String end_date) {
		this.end_date = end_date;
	}
	/**
	 * @return the user_id
	 */
	public int getUser_id() {
		return user_id;
	}
	/**
	 * @param user_id the user_id to set
	 */
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	/**
	 * @return the job_id
	 */
	public int getJob_id() {
		return job_id;
	}
	/**
	 * @param job_id the job_id to set
	 */
	public void setJob_id(int job_id) {
		this.job_id = job_id;
	}
	/**
	 * @return the status_id
	 */
	public int getStatus_id() {
		return status_id;
	}
	/**
	 * @param status_id the status_id to set
	 */
	public void setStatus_id(int status_id) {
		this.status_id = status_id;
	}
	/**
	 * @param id
	 * @param name
	 * @param star_date
	 * @param end_date
	 * @param user_id
	 * @param job_id
	 * @param status_id
	 */
	public tasks(int id, String name, String star_date, String end_date, int user_id, int job_id, int status_id) {
		super();
		this.id = id;
		this.name = name;
		this.star_date = star_date;
		this.end_date = end_date;
		this.user_id = user_id;
		this.job_id = job_id;
		this.status_id = status_id;
	}
	
	public tasks() {
		
	}
	
	public void xuat() {
		System.out.println("Xuất thông tin dự án");
		System.out.println("ID. "+this.id+
				" Tên dự án: "+this.name);
	}
}
