package com.java14.crm.QuanLy.list;

import java.util.ArrayList;

import com.java14.crm.QuanLy.duan.jobs;

public class listJob {
	ArrayList<jobs> listJob = new ArrayList<>();

	/**
	 * @return the listJob
	 */
	public ArrayList<jobs> getListJob() {
		return listJob;
	}

	/**
	 * @param listJob the listJob to set
	 */
	public void setListJob(ArrayList<jobs> listJob) {
		this.listJob = listJob;
	}

	/**
	 * @param listJob
	 */
	public listJob(ArrayList<jobs> listJob) {
		super();
		this.listJob = listJob;
	}
	
	public listJob() {
		
	}
	
	public void them(jobs jb) {
		this.listJob.add(jb);
	}
	
	public void xuatTinhTrangCongViec(int task_id_check) {
		for(jobs jb: this.listJob) {
			if(jb.getId()==task_id_check) {
				jb.xuat();
			}
		}
	}
	
	public void xuat() {
		for(jobs jb:this.listJob) {
			jb.xuat();
		}
	}
	
	public jobs timJobsTheoId(int id_check) {
		for(jobs jb: this.listJob) {
			if(jb.getId()==id_check) {
				return jb;
			}
		}
		return null;
	}
}
