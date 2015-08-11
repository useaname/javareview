package test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class OutPutTest {
	
	public static String src = "E:\\workplace1\\review\\src\\test\\OutPutTest.java";
	
	
	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(src);
			int hasRead = 0;
			byte[] bbuf = new byte[1024];
			while ((hasRead = fis.read(bbuf)) > 0) {
				System.out.println(new String(bbuf,0,hasRead));
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != fis) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
		System.out.println("--------------------------------------------");
		
		
		FileReader fr = null;
		
		try {
			fr = new FileReader(src);
			char[] cbuf = new char[1024];
			int hasRead1 = 0;
			while ((hasRead1 = fr.read(cbuf)) > 0) {
				System.out.println(new String(cbuf,0,hasRead1));
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			try {
				fr.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
