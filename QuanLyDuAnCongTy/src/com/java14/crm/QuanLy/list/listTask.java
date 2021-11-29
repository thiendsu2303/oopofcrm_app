package com.java14.crm.QuanLy.list;

import java.util.ArrayList;

import com.java14.crm.QuanLy.duan.tasks;

public class listTask {
	ArrayList<tasks> listTask = new ArrayList<>();

	/**
	 * @return the listTask
	 */
	public ArrayList<tasks> getListTask() {
		return listTask;
	}

	/**
	 * @param listTask the listTask to set
	 */
	public void setListTask(ArrayList<tasks> listTask) {
		this.listTask = listTask;
	}

	/**
	 * @param listTask
	 */
	public listTask(ArrayList<tasks> listTask) {
		super();
		this.listTask = listTask;
	}
	
	public listTask() {
		
	}
	
	public void them(tasks tk) {
		this.listTask.add(tk);
	}
	
	
	public void xuat() {
		for(tasks tkk: this.listTask) {
			tkk.xuat();
		}
	}
	
	public void xuatTheoYeuCau(int task_id_check) {
		for(tasks tk: this.listTask) {
			if(tk.getId()==task_id_check) {
				tk.xuat();
			}
		}
	}
	
	public void xoaDuAn(int id_check) {
		for(tasks tk: this.listTask) {
			if(tk.getId()==id_check) {
				this.listTask.remove(tk);
				break;
			}
		}
	}
}
