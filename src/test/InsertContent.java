package test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;

public class InsertContent {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		insertContent(".//src//test//InsertContent.java",45,"ASDFFF");
		System.out.println(System.currentTimeMillis() - start);
	}
	
	public static void insertContent(String fileName,long pos,String insertContnet) {
			RandomAccessFile raf = null;
			try {
				raf = new RandomAccessFile(fileName, "rw");
				File tmpFile = File.createTempFile("tmp", null);
				FileOutputStream tmpOut = new FileOutputStream(tmpFile);
				FileInputStream tmpIn = new FileInputStream(tmpFile);
				
				raf.seek(pos);
				byte[] buf = new byte[64];
				int hasRead = 0;
				while ((hasRead = raf.read(buf)) > 0) {
					tmpOut.write(buf, 0, hasRead);
				}
				raf.seek(pos);
				raf.write(insertContnet.getBytes());
				while ((hasRead = tmpIn.read(buf)) > 0) {
					raf.write(buf,0,hasRead);
				}
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally {
				if (null != raf ) {
					try {
						raf.close();
					} catch (IOException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
	}
}
