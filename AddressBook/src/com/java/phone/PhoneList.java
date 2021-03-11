package com.java.phone;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.StringTokenizer;

public class PhoneList{
	
	File f = new File("D:\\kdy_workspace\\AddressBook\\PhoneDB.txt");
	
	public void showList() {
		
		int num = 0;
			//		Main Stream
			Reader reader = null;
			//	보조 스트림
			BufferedReader br = null;
			
			try {
				reader = new FileReader(f);
				br = new BufferedReader(reader);
				
				String line = null;
				
				while((line = br.readLine()) != null) {
					//	line을 분절
					
					StringTokenizer st = new StringTokenizer(line,	//	분절시킬 문자열
															",");	//	분절시킬 구분자 - 기본값 : 공백, \t, \r, \n
					System.out.print((num + 1) + ".\t");
					while(st.hasMoreTokens()) {			//	뒤에 토큰이 더 있는가?
						String token = st.nextToken();	//	토큰을 받아오고 다음으로 이동
						System.out.print(token + "\t");
					}
					System.out.println();
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
