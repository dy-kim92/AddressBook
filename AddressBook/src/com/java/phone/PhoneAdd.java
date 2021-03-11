package com.java.phone;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class PhoneAdd{
		
	File f = new File("D:\\kdy_workspace\\AddressBook\\PhoneDB.txt");
	
	public void add() {
		
			Scanner sc = new Scanner(System.in);
		
			//		Main Stream
			Writer writer = null;
			//	보조 스트림
			BufferedWriter bw = null;
		

			
			System.out.println("<2.등록>");
			System.out.print(">이름 : ");
			String name = sc.next();
			System.out.print(">휴대전화 : ");
			String hp = sc.next();
			System.out.print(">집전화 : ");
			String tel = sc.next();
			
			try {
				writer = new FileWriter(f, true);
				bw = new BufferedWriter(writer);
				
				bw.write(name + "," + hp + "," + tel);
				bw.newLine();
				
				System.out.println("[등록되었습니다.]");
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();
				}catch (Exception e) {
					
				}
			}
			
		
		
	}
	
}
