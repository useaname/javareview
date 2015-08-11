package io;


import java.io.FileReader;

public class ReadFile2 {
	//字符输出流
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileReader fr = new FileReader("E:\\workplace1\\review\\src\\io\\ReadFile2.java");
		char[] cbuf = new char[1024];
		int size = 0;
		while ((size = fr.read(cbuf)) > 0) {
			System.out.println(new String(cbuf,0,size));
		}
		fr.close();

	}

}
