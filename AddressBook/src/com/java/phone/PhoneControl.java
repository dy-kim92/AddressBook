package com.java.phone;

import java.util.Scanner;


public class PhoneControl{
	
	Scanner sc = new Scanner(System.in);
	
	PhoneList pl = new PhoneList();
	PhoneAdd pa = new PhoneAdd();
	PhoneDel pd = new PhoneDel();
	PhoneSearch ps = new PhoneSearch();
	
	public void Start() {
		
		boolean flag = true;
		System.out.println("--------------------------------------");
		System.out.println("*        전화번호 관리 프로그램           *");
		System.out.println("--------------------------------------");
		
		while(flag) {
			System.out.println("1.리스트  2.등록  3.삭제  4.검색  5.종료");
			System.out.println("--------------------------------------");
			System.out.print(">메뉴번호 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1:
				pl.showList();
				break;
			case 2:
				pa.add();
				break;
			case 3:
				pd.del();
				break;
			case 4:
				ps.search();
				break;
			case 5:
				flag = false;
				break;
				
				default:
					System.out.println("[다시 입력해 주세요]");
			}
			
			
		}
		
		System.out.println("--------------------------------------");
		System.out.println("*             감사합니다                *");
		System.out.println("--------------------------------------");
	}



}
