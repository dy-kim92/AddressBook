package com.java.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class PhoneDel{
	
	File f = new File("D:\\kdy_workspace\\AddressBook\\PhoneDB.txt");
	
	public void del() {
		
			Scanner sc = new Scanner(System.in);
		
			//		Main Stream
			Reader reader = null;
			Writer writer = null;
			//	보조 스트림
			BufferedReader br = null;
			BufferedWriter bw = null;
		
			Vector<String> v = new Vector<>();
			
			System.out.println("<3.삭제>");
			System.out.print(">번호 : ");
			int num = sc.nextInt();
			int flag = 0;
			
			try {
				reader = new FileReader(f);
				br = new BufferedReader(reader);
				
				writer = new FileWriter(f, true);
				bw = new BufferedWriter(writer);
				
				
				String line = null;
				
				while((line = br.readLine()) != null) {
					
					StringTokenizer st = new StringTokenizer(line,	//	분절시킬 문자열
															"\n");	//	분절시킬 구분자 - 기본값 : 공백, \t, \r, \n
					v.addElement(line);
					
					while(st.hasMoreTokens()) {			//	뒤에 토큰이 더 있는가?
						String token = st.nextToken();	//	토큰을 받아오고 다음으로 이동
					}
					flag++;
				}
				
				for(int i = 0; i < v.size(); i++) {
					if(i != (num - 1)) {
						bw.write(v.elementAt(i));
						bw.newLine();
					}else {
					}
				}

				System.out.println("[삭제되었습니다.]");
				
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				try {
					bw.close();
					br.close();
					v.clear();
				}catch (Exception e) {
					
				}
		
		}
	
	}
}
