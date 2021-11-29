package com.java14.crm.QuanLy.duan;

public class status {
	private int id;
	private String name;
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
	 * @param id
	 * @param name
	 */
	public status(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public status() {
		
	}
	
	public void xuat() {
		System.out.println("Tình trạng dự án: "+this.name);
	}
}
