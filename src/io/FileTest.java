package io;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) throws IOException {
		File file = new File(".");
		//获取文件名
		System.out.println(file.getName());
		System.out.println(file.getParent());
		System.out.println(file.getAbsoluteFile());
		System.out.println(file.getAbsoluteFile().getParent());
		
		File tempFile = File.createTempFile("aaaaa", ".txt",file);
		tempFile.deleteOnExit();
	}
}
