/**
 * 
 */
package com.java14.crm.QuanLy.cty;

import java.util.Scanner;

import com.java14.crm.QuanLy.duan.jobs;
import com.java14.crm.QuanLy.duan.status;
import com.java14.crm.QuanLy.duan.tasks;
import com.java14.crm.QuanLy.list.listJob;
import com.java14.crm.QuanLy.list.listRole;
import com.java14.crm.QuanLy.list.listStatus;
import com.java14.crm.QuanLy.list.listTask;
import com.java14.crm.QuanLy.list.listUser;
import com.java14.crm.QuanLy.lop.roles;
import com.java14.crm.QuanLy.lop.user;

/**
 * @author maichienvithien
 * quản lí toàn bộ thông tin
 *
 */
public class CongTy {
	private listUser objListUser;
	private listRole objListRole;
	private listTask objListTask;
	private listJob objListJob;
	private listStatus objListStatus;
	/**
	 * @return the objListUser
	 */
	public listUser getObjListUser() {
		return objListUser;
	}
	/**
	 * @param objListUser the objListUser to set
	 */
	public void setObjListUser(listUser objListUser) {
		this.objListUser = objListUser;
	}
	/**
	 * @return the objListRole
	 */
	public listRole getObjListRole() {
		return objListRole;
	}
	/**
	 * @param objListRole the objListRole to set
	 */
	public void setObjListRole(listRole objListRole) {
		this.objListRole = objListRole;
	}
	/**
	 * @return the objListTask
	 */
	public listTask getObjListTask() {
		return objListTask;
	}
	/**
	 * @param objListTask the objListTask to set
	 */
	public void setObjListTask(listTask objListTask) {
		this.objListTask = objListTask;
	}
	/**
	 * @return the objListJob
	 */
	public listJob getObjListJob() {
		return objListJob;
	}
	/**
	 * @param objListJob the objListJob to set
	 */
	public void setObjListJob(listJob objListJob) {
		this.objListJob = objListJob;
	}
	/**
	 * @return the objListStatus
	 */
	public listStatus getObjListStatus() {
		return objListStatus;
	}
	/**
	 * @param objListStatus the objListStatus to set
	 */
	public void setObjListStatus(listStatus objListStatus) {
		this.objListStatus = objListStatus;
	}
	/**
	 * @param objListUser
	 * @param objListRole
	 * @param objListTask
	 * @param objListJob
	 * @param objListStatus
	 */
	public CongTy(listUser objListUser, listRole objListRole, listTask objListTask, listJob objListJob,
			listStatus objListStatus) {
		super();
		this.objListUser = objListUser;
		this.objListRole = objListRole;
		this.objListTask = objListTask;
		this.objListJob = objListJob;
		this.objListStatus = objListStatus;
	}
	
	public CongTy() {
		this.objListUser = new listUser();
		this.objListRole = new listRole();
		this.objListTask = new listTask();
		this.objListJob = new listJob();
		this.objListStatus = new listStatus();
	}
	
	public void dummyDataUser() {
		user us = new user();
		
		us = new user(1,"vithien23@gmail.com","thiendsu23","Mai Chiến Vĩ Thiên","12345.ip",1);
		this.objListUser.them(us);
		
		us = new user(2,"quocdattranhuu1606@gmail.com","quocdat","Trần Hữu Quốc Đạt","12346.ip",2);
		this.objListUser.them(us);
		
		us = new user(3,"nphuyy1901@gmail.com","nphuyyy1901","Nguyễn Phước Huy","12347.ip",1);
		this.objListUser.them(us);
		
		us = new user(4,"hoanghp2510@gmail.com","hoanghp25","Phạm Minh Hoàng","12348.ip",2);
		this.objListUser.them(us);
		
		us = new user(5,"lephutan468@gmail.com ","phutan468","Lê Phú Tấn","12349.ip",2);
		this.objListUser.them(us);
		
		us = new user(6,"tuannguyen2924@gmail.com","tuan2924","Nguyễn Khắc Tuấn","12344.ip",3);
		this.objListUser.them(us);
		
		us = new user(7,"namtranjr158@gmail.com","namtran","Trần Hoài Nam","12343.ip",3);
		this.objListUser.them(us);
		
		us = new user(8,"tranhaunguyen0979@gmail.com","haunguyen0779","Trần Hậu Nguyên","12342.ip",2);
		this.objListUser.them(us);
		
		us = new user(9,"decadeq11@gmail.com","daoinhquang","Trần Đào Đình Quang","12341.ip",3);
		this.objListUser.them(us);
		
		us = new user(10,"tuanminh01659889@gmail.com","minh1659","Trương Tuấn Minh","12334.ip",3);
		this.objListUser.them(us);
		
		us = new user(11,"khoinguyen16399@gmail.com","khoinguyen163","Phan Hoài Khôi Nguyên","12335.ip",3);
		this.objListUser.them(us);
		
		us = new user(12,"maihang.hlu@gmail.com","maihang","Mai Thị Hằng","12233.ip",3);
		this.objListUser.them(us);
		
		us = new user(13,"raymustang95@gmail.com","giahung123","Trần Gia Hưng","12236.ip",3);
		this.objListUser.them(us);
		
		us = new user(14,"ktc1311@gmail.com","ktc1311","Trần Vũ Việt Cường","12237.ip",3);
		this.objListUser.them(us);
		
		us = new user(15,"duylinh0311@gmail.com","duylinh123","Nguyễn Duy Linh","12238.ip",1);
		this.objListUser.them(us);
		
	}
	
	public void dummyDataRole() {
		roles rl = new roles();
		
		rl = new roles(1,"ADMIN"," Quản lý toàn bộ thông tin");
		this.objListRole.them(rl);
		
		rl = new roles(2,"LEADER"," Quản lý một dự án");
		this.objListRole.them(rl);
		
		rl = new roles(3,"MEMBER"," Nhân sự cho dự án");
		this.objListRole.them(rl);
	}
	
	public void dummyDataStatus() {
		status st = new status();
		
		st = new status(1,"Chưa hoàn thành");
		this.objListStatus.them(st);
		
		st = new status(2,"Đang làm");
		this.objListStatus.them(st);
		
		st = new status(3,"Đã hoàn thành");
		this.objListStatus.them(st);
	}
	
	public void dummyDataJob() {
		jobs jb = new jobs();
		
		jb = new jobs(1,"Công việc 1","2/1/2021","15/1/2021");
		this.objListJob.them(jb);
		
		jb = new jobs(2,"Công việc 2","16/1/2021","30/1/2021");
		this.objListJob.them(jb);
		
		jb = new jobs(3,"Công việc 3","1/2/2021","15/2/2021");
		this.objListJob.them(jb);
		
		jb = new jobs(4,"Công việc 4","16/2/2021","28/2/2021");
		this.objListJob.them(jb);
		
		jb = new jobs(5,"Công việc 5","1/3/2021","15/3/2021");
		this.objListJob.them(jb);
		
		jb = new jobs(6,"Công việc 6","16/3/2021","16/4/2021");
		this.objListJob.them(jb);
	}
	
	public void dummyDataTask() {
		tasks tk = new tasks();
		
		tk = new tasks(1,"Dự án 1","1/1/2021","1/2/2021",2,2,1);
		this.objListTask.them(tk);
		
		tk = new tasks(2,"Dự án 2","1/3/2021","1/5/2021",3,6,2);
		this.objListTask.them(tk);
		
		tk = new tasks(3,"Dự án 3","1/4/2021","1/7/2021",10,6,2);
		this.objListTask.them(tk);
		
		tk = new tasks(4,"Dự án 4","1/6/2021","1/8/2021",1,5,3);
		this.objListTask.them(tk);
		
		tk = new tasks(5,"Dự án 5","1/10/2021","2/12/2021",6,3,1);
		this.objListTask.them(tk);
	}
	
	public void xoaNhanSu(Scanner scan) {
		System.out.println("Mời bạn nhập id của bạn");
		int id_check=Integer.parseInt(scan.nextLine());
		this.objListUser.xoaMember(id_check, scan);
	}
	
	public void xemThongTinDuAn(Scanner scan) {
		System.out.println("Những dự án đang có");
		this.objListTask.xuat();
		System.out.println("Mời nhập id của dự án bạn muốn xem");
		int task_id_check=Integer.parseInt(scan.nextLine());
		this.objListTask.xuatTheoYeuCau(task_id_check);
		System.out.println("Bạn có muốn xem tình trạng dự án không?");
		System.out.println("1. Có");
		System.out.println("2.Không");
		int check = Integer.parseInt(scan.nextLine());
		if(check==1) {
			this.objListStatus.xuatTinhTrang(task_id_check);
		}
		System.out.println("Bạn có muốn xem các công việc của dự án không?");
		System.out.println("1. Có");
		System.out.println("2.Không");
		int checkk = Integer.parseInt(scan.nextLine());
		if(checkk==1) {
			this.objListJob.xuatTinhTrangCongViec(task_id_check);
		}
	}
	
	public void xuatToanBo() {
		for(user us:this.objListUser.getListUser()) {
			us.xuat();
		}
	}
	
	public void xuatDuAn() {
		for(tasks tk: this.objListTask.getListTask()) {
			tk.xuat();
		}
	}
	
	public void themNhanSu(Scanner scan) {
		System.out.println("Chức năng thêm nhân viên");
		System.out.println("Mời bạn nhập id");
		int id_check=Integer.parseInt(scan.nextLine());
		int id_checkk = 0;
		for(user uss: this.objListUser.getListUser()) {
			if(id_check==uss.getId()) {
				id_checkk = uss.getRole_id();
				break;
			}
		}
		if(id_checkk==3) {
			System.out.println("Bạn là MEMBER nên bạn không thể thêm thành viên");
			return;
		} else if(id_checkk==2) {
			System.out.println("Bạn là LEADER nên bạn chỉ có thể thêm MEMBER");
			themMember(scan);
		} else if(id_checkk==1) {
			System.out.println("Bạn là ADMIN nên bạn có thể thêm LEADER hoặc MEMBER");
			System.out.println("1. Thêm LEADER");
			System.out.println("2. Thêm MEMBER");
			int cc = Integer.parseInt(scan.nextLine());
			if(cc==1) {
				themLeader(scan);
			} else {
				themMember(scan);
			}
		}
	}
	
	private void themMember(Scanner scan) {
		System.out.println("Mời nhập thông tin MEMBER mà bạn muốn thêm");
		System.out.print("ID: ");
		int new_id=Integer.parseInt(scan.nextLine());
		System.out.print("Email: ");
		String new_email=scan.nextLine();
		System.out.print("Password: ");
		String new_pass = scan.nextLine();
		System.out.print("Họ và tên: ");
		String new_name = scan.nextLine();
		System.out.print("Avatar: ");
		String new_ava = scan.nextLine();
		user us = new user(new_id,new_email,new_pass,new_name,new_ava,3);
		this.objListUser.getListUser().add(us);
	}
	
	private void themLeader(Scanner scan) {
		System.out.println("Mời nhập thông tin LEADER mà bạn muốn thêm");
		System.out.print("ID: ");
		int new_id=Integer.parseInt(scan.nextLine());
		System.out.print("Email: ");
		String new_email=scan.nextLine();
		System.out.print("Password: ");
		String new_pass = scan.nextLine();
		System.out.print("Họ và tên: ");
		String new_name = scan.nextLine();
		System.out.print("Avatar: ");
		String new_ava = scan.nextLine();
		user us = new user(new_id,new_email,new_pass,new_name,new_ava,2);
		this.objListUser.getListUser().add(us);
	}
	
	public void xoaDuAn(Scanner scan) {
		System.out.println("Chức năng xóa dự án");
		System.out.println("Mời bạn nhập id");
		int id_check=Integer.parseInt(scan.nextLine());
		int id_checkk = 0;
		for(user uss: this.objListUser.getListUser()) {
			if(id_check==uss.getId()) {
				id_checkk = uss.getRole_id();
				break;
			}
		}
		if(id_checkk == 1) {
			System.out.println("Những dự án đang có");
			this.objListTask.xuat();
			System.out.println("Mời nhập ID của dự án mà bạn muốn xóa");
			int check_id_task = Integer.parseInt(scan.nextLine());
			this.objListTask.xoaDuAn(check_id_task);
		} else {
			System.out.println("Bạn không phải là ADMIN nên không thể xóa dự án");
		}
	}
	
	public void themDuAn(Scanner scan) {
		System.out.println("Chức năng thêm dự án ");
		System.out.println("Mời bạn nhập id");
		int id_check=Integer.parseInt(scan.nextLine());
		int id_checkk = 0;
		for(user uss: this.objListUser.getListUser()) {
			if(id_check==uss.getId()) {
				id_checkk = uss.getRole_id();
				break;
			}
		}
		if(id_checkk==1) {
			System.out.println("Mời nhập thông tin dự án mà bạn muốn thêm");
			System.out.println("ID của dự án");
			int new_id = Integer.parseInt(scan.nextLine());
			System.out.println("Tên của dự án");
			String new_name = scan.nextLine();
			System.out.println("Ngày bắt đầu dự án");
			String new_start_date = scan.nextLine();
			System.out.println("Ngày kết thúc dự án");
			String new_end_date = scan.nextLine();
			// tìm người muốn phân công cho dự án
			System.out.println("Nhập thông tin của người phụ trách dự án");
			System.out.println("Những người có trong công ty");
			this.objListUser.xuat();
			System.out.println("Mời nhập ID của người mà bạn muốn phân công");
			int idd = Integer.parseInt(scan.nextLine());
			user us = new user();
			us = this.objListUser.timUserTheoId(scan, idd);
			int new_user_id = us.getId();
			// phân bổ công việc cho dự án
			System.out.println("Danh sách công việc");
			this.objListJob.xuat();
			System.out.println("Mời nhập ID của công việc mà bạn muốn phân công");
			int iddd = Integer.parseInt(scan.nextLine());
			jobs jb = new jobs();
			jb = this.objListJob.timJobsTheoId(iddd);
			int new_job_id = jb.getId();
			// cập nhật tình trạng dự án
			System.out.println("Các trạng thái");
			this.objListStatus.xuat();
			System.out.println("Mời nhập ID của trạng thái mà bạn muốn cập nhật cho dự án");
			int idst = Integer.parseInt(scan.nextLine());
			status st = new status() ;
			st = this.objListStatus.timStatusTheoID(idst);
			int new_status_id = st.getId();
			// them dự án vào danh sách
			tasks tk = new tasks(new_id,new_name,new_start_date,new_end_date,new_user_id,new_job_id,new_status_id);
			this.objListTask.getListTask().add(tk);
			
		} else {
			System.out.println("Bạn không phải là ADMIN nên không thể thêm dự án");
		}
	}
}
