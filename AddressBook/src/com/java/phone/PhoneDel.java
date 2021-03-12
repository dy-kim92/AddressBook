package com.java.phone;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

public class PhoneDel{
	static final String rootPath = System.getProperty("user.dir") + "\\";
	static final String filename = rootPath + "PhoneDB.txt";
	
	public void del() {
		
			Scanner sc = new Scanner(System.in);
		
			Reader reader = null;
			Writer writer = null;
			BufferedReader br = null;
			BufferedWriter bw = null;
		
			Vector<String> v = new Vector<>();
			
			System.out.println("<3.삭제>");
			System.out.print(">번호 : ");
			int num = sc.nextInt();
			int flag = 0;
			
			try {
				reader = new FileReader(filename);
				br = new BufferedReader(reader);
				
				writer = new FileWriter(filename, true);
				bw = new BufferedWriter(writer);
				
				
				String line = null;
				
				while((line = br.readLine()) != null) {
					
					StringTokenizer st = new StringTokenizer(line,
															"\n");
					v.addElement(line);
					
					while(st.hasMoreTokens()) {	
						String token = st.nextToken();
					}
					flag++;
				}
				FileWriter fw = new FileWriter(filename);
				
				for(int i = 0; i < v.size(); i++) {
					if(i != (num - 1)) {
						fw.write(v.elementAt(i) + "\n");
					}else {
					}
				}
				fw.flush();
				fw.close();
				
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
