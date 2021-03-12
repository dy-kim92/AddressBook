package com.java.phone;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class PhoneSearch{
	static final String rootPath = System.getProperty("user.dir") + "\\";
	static final String filename = rootPath + "PhoneDB.txt";
	
	public void search() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<4.검색>");
		System.out.print(">이름 : ");
		String name = sc.next();
		
		int num = 0;
		Reader reader = null;
		BufferedReader br = null;
		
		try {
			reader = new FileReader(filename);
			br = new BufferedReader(reader);
			
			String line = null;
			
			while((line = br.readLine()) != null) {
				
				StringTokenizer st = new StringTokenizer(line,
														",");
				if(line.contains(name) == true) {
					System.out.print((num + 1) + ".\t");
					while(st.hasMoreTokens()) {	
						String token = st.nextToken();
						System.out.print(token + "\t");
					}
					System.out.println();
				}
				num++;
			}
		}catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		}catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				br.close();
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
