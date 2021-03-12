package com.java.phone;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Scanner;

public class PhoneAdd{
		
	static final String rootPath = System.getProperty("user.dir") + "\\";
	static final String filename = rootPath + "PhoneDB.txt";
	
	public void add() {
		
			Scanner sc = new Scanner(System.in);
		
			Writer writer = null;
			BufferedWriter bw = null;
			
			System.out.println("<2.등록>");
			System.out.print(">이름 : ");
			String name = sc.next();
			System.out.print(">휴대전화 : ");
			String hp = sc.next();
			System.out.print(">집전화 : ");
			String tel = sc.next();
			
			try {
				writer = new FileWriter(filename, true);
				bw = new BufferedWriter(writer);
				
				bw.write(name + "," + hp + "," + tel);
				bw.newLine();
				
				System.out.println("[등록되었습니다.]");
			}catch(FileNotFoundException e) {
				System.err.println("파일을 찾을 수 없습니다.");
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
