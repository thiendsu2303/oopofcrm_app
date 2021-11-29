/**
 * 
 */
package com.java14.crm.QuanLy;

import java.util.ArrayList;
import java.util.Scanner;

import com.java14.crm.QuanLy.cty.CongTy;


/**
 * @author maichienvithien
 *
 */
public class MainProgram {

	/**
	 * @param args
	 */
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner scan = new Scanner(System.in);
			CongTy cty = new CongTy();
			cty.dummyDataUser(); 
			cty.dummyDataRole(); 
			cty.dummyDataTask();
			cty.dummyDataStatus();
			cty.dummyDataJob();
			doMenu(scan,cty);

		}
		private static void inMenu() {
			System.out.println("Mời chọn phương thức mà bạn yêu cầu");
			System.out.println("1. Xuất toàn bộ nhân sự");
			System.out.println("2. Xóa nhân sự");
			System.out.println("3. Xem dự án");
			System.out.println("4. Thêm nhân sự");
			System.out.println("5. Xóa dự án");
			System.out.println("6. Xuất thông tin tất cả dự án");
			System.out.println("7. Thêm dự án");
			System.out.println("0. Thoát chương trình");
		}
		
		private static void doMenu(Scanner scan, CongTy cty) {
			System.out.println("Chào mừng bạn đến mới quản lí nhân sự!");
			
			while(true) {
				inMenu();
				int chon = Integer.parseInt(scan.nextLine());
				switch(chon) {
				case 1:
					cty.xuatToanBo();
					break;
				case 2:
					cty.xoaNhanSu(scan);
					break;
				case 3:
					cty.xemThongTinDuAn(scan);
					break;
				case 4:
					cty.themNhanSu(scan);
					break;
				case 5:
					cty.xoaDuAn(scan);
					break;
				case 6:
					cty.xuatDuAn();
					break;
				case 7:
					cty.themDuAn(scan);
					break;
				case 0:
					return ;
				}
			}
        }
}
