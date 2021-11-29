package com.java14.crm.QuanLy.list;

import java.util.ArrayList;

import com.java14.crm.QuanLy.duan.status;

public class listStatus {
	ArrayList<status> listStatus = new ArrayList<>();

	/**
	 * @return the listStatus
	 */
	public ArrayList<status> getListStatus() {
		return listStatus;
	}

	/**
	 * @param listStatus the listStatus to set
	 */
	public void setListStatus(ArrayList<status> listStatus) {
		this.listStatus = listStatus;
	}

	/**
	 * @param listStatus
	 */
	public listStatus(ArrayList<status> listStatus) {
		super();
		this.listStatus = listStatus;
	}
	
	public listStatus() {
		
	}
	
	public void them(status st) {
		this.listStatus.add(st);
	}
	
	public void xuatTinhTrang(int id_check) {
		for(status st: this.listStatus) {
			if(st.getId()==id_check) {
				st.xuat();
			}
		}
	}
	
	public void xuat() {
		for(status st: this.listStatus) {
			st.xuat();
		}
	}
	
	public status timStatusTheoID(int id_check) {
		for(status st: this.listStatus) {
			if(st.getId()==id_check) {
				return st;
			}
		}
		return null;
	}
}
