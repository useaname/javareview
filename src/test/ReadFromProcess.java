package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ReadFromProcess {
	public static void main(String[] args) {
		try {
			Process p = Runtime.getRuntime().exec("javac");
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getErrorStream(),"GBK"));
			String buff;
			while ((buff = br.readLine()) != null ) {
				System.out.println(buff);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
