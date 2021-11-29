package com.java14.crm.QuanLy.lop;

public class roles {
	private int id;
	private String name;
	private String description;
	
	
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	
	


	/**
	 * @param id
	 * @param name
	 * @param description
	 */
	public roles(int id, String name, String description) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
	}


	public roles() {
		
	}
}
