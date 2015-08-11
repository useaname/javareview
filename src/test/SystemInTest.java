package test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class SystemInTest  {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		String buffer = null;
//		try {
			while (true) {
				if(br.readLine()==null){
					Scanner sc = new Scanner(System.in);
					buffer = sc.next();
				}
				if ("exit".equals(buffer)) {
					System.exit(1);
				}
				System.out.println("输入的:"+buffer);
				
			}
			
//		} 
//		catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
	}
}
