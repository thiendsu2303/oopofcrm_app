/**
 * 
 */
package com.java14.crm.QuanLy.list;

import java.util.ArrayList;

import com.java14.crm.QuanLy.lop.roles;
import com.java14.crm.QuanLy.lop.user;

/**
 * @author maichienvithien
 * danh sách vai trò
 */
public class listRole {
	ArrayList<roles> listRole = new ArrayList<>();

	/**
	 * @return the listRole
	 */
	public ArrayList<roles> getListRole() {
		return listRole;
	}

	/**
	 * @param listRole the listRole to set
	 */
	public void setListRole(ArrayList<roles> listRole) {
		this.listRole = listRole;
	}
	
	public void them(roles rl) {
		this.listRole.add(rl);
	}
	
}
