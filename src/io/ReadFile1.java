package io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile1 {

	public static void main(String[] args) throws IOException {
		
		long s = System.currentTimeMillis();
		//字节输出流
		// TODO Auto-generated method stub
		FileInputStream fis  = new FileInputStream("E:"+File.separator+"workplace1"+File.separator+"review"+File.separator+"src"+File.separator+"io"+File.separator+"ReadFile1.java");
		byte[] buf = new byte[1];
		int size = 0;
		while ((size = fis.read(buf)) > 0) {
			System.out.println(new String(buf,0,size));
		}
		fis.close();
		long res = System.currentTimeMillis() - s;
		System.out.println("res" + res);
		//System.out.println("AAA");
	}

}
