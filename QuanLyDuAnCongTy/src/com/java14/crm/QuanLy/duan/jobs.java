package com.java14.crm.QuanLy.duan;

public class jobs {
	private int id;
	private String name;
	private String start_date;
	private String end_date;
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
	 * @return the start_date
	 */
	public String getStart_date() {
		return start_date;
	}
	/**
	 * @param start_date the start_date to set
	 */
	public void setStart_date(String start_date) {
		this.start_date = start_date;
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
	 * @param id
	 * @param name
	 * @param start_date
	 * @param end_date
	 */
	public jobs(int id, String name, String start_date, String end_date) {
		super();
		this.id = id;
		this.name = name;
		this.start_date = start_date;
		this.end_date = end_date;
	}
	
	public jobs() {
		
	}
	
	public void xuat() {
		System.out.println("Tên công việc: "+this.name+
				" Ngày bắt đầu: "+this.start_date+
				" Ngày kết thúc: "+this.end_date);
	}
}
