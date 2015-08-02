package io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
	public static void main(String[] args) {
		String src = "1.ABCXDSSABCXDSSABCXDSS;\r\n"+"2.ABCXDSS;\r\n"+"3.ABCXDSS;\r\n";
		StringReader sr = new StringReader(src);
		char[] cbuf = new char[32];
		int hasRead = 0;
		try {
			while ((hasRead = sr.read(cbuf)) > 0) {
				System.out.println(new String(cbuf,0,hasRead));
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != sr) {
				sr.close();
			}
		}
		
		StringWriter sw = new StringWriter(20);
		sw.write("啊啊啊啊,\r\n");
		sw.write("啊三十多度,\r\n");
		sw.write("反对党发反反复复,\r\n");
		sw.write("发反反复复方法十点三十.");
		
		
		System.out.println(sw.toString());
		
		FileWriter fw = null;
		try {
			fw = new FileWriter("file.txt");
			fw.write(sw.toString(), 0, sw.toString().length());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != fw){
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
