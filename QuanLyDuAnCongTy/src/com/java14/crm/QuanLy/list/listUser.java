/**
 * 
 */
package com.java14.crm.QuanLy.list;

import java.util.ArrayList;
import java.util.Scanner;

import com.java14.crm.QuanLy.lop.user;

/**
 * @author maichienvithien
 * quản lí danh sách người dùng
 */
public class listUser {
	ArrayList<user> listUser;

	/**
	 * @return the listUser
	 */
	public ArrayList<user> getListUser() {
		return listUser;
	}

	/**
	 * @param listUser the listUser to set
	 */
	public void setListUser(ArrayList<user> listUser) {
		this.listUser = listUser;
	}

	/**
	 * @param listUser
	 */
	public listUser(ArrayList<user> listUser) {
		super();
		this.listUser = listUser;
	}
	
	public listUser() {
		listUser = new ArrayList<>();
	}
	
	public void them(user us) {
		this.listUser.add(us);
	}
	
	public void xoaMember(int id_checkk,Scanner scan) {
		if(id_checkk==1 || id_checkk==2) {
			if(id_checkk==1) {
				ArrayList<user> newList= new ArrayList<user>();
				System.out.println("Bạn là admin bạn có quyền xóa LEADER và MEMBER");
			    System.out.println("Danh sách những người mà bạn có thể xóa");
			    for(user uss: this.listUser) {
			    	if(uss.getRole_id()==2 || uss.getRole_id()==3) {
			    		uss.xuat();
			    		newList.add(uss);
			    	}
			    }
			    System.out.println("Mời nhập id của người mà bạn muốn xóa");
			    int id_check=Integer.parseInt(scan.nextLine());
			    for(user ucc: newList) {
			    	if(ucc.getId()==id_check) {
			    		this.listUser.remove(ucc);
			    	}
			    }
			    
			} else if(id_checkk==2) {
				ArrayList<user> newList= new ArrayList<user>();
				System.out.println("Bạn là LEADER bạn có quyền xóa MEMBER");
			    System.out.println("Danh sách những người mà bạn có thể xóa");
			    for(user uss: this.listUser) {
			    	if(uss.getRole_id()==3) {
			    		uss.xuat();
			    		newList.add(uss);
			    	}
			    }
			    System.out.println("Mời nhập id của người mà bạn muốn xóa");
			    int id_check=Integer.parseInt(scan.nextLine());
			    for(user ucc: newList) {
			    	if(ucc.getId()==id_check) {
			    		this.listUser.remove(ucc);
			    	}
			    }
			}
		} else {
			System.out.println("Thoát chức năng do MEMEBER không thực hiện chức năng xóa thành viên");
			return ;
		}
	}
	
	public void xuat() {
		for(user us: this.listUser) {
			us.xuat();
		}
	}
	
	public user timUserTheoId(Scanner scan,int id_check) {
		for(user us:this.listUser) {
			if(us.getId()==id_check) {
				return us;
			}
		}
		return null;
		
	}
}
