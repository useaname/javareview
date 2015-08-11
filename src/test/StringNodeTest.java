package test;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.io.StringWriter;

public class StringNodeTest {
	public static void main(String[] args) {
		String src = "软泥上的青荇，\n"
				+"油油的在水底招摇;\n"
				+"在康河的柔波里，\n"
				+"我甘心做一条水草。";
		
		StringReader sr = new StringReader(src);
		BufferedWriter bw = null;
		StringWriter sw = new StringWriter(20);
		char[] cbuf = new char[1024];
		int hasRead = 0;
		sw.write("但我不能放歌，\n");
		sw.write("悄悄是别离的笙箫；\n");
		sw.write("夏虫也为我沉默，\n");
		sw.write("沉默是今晚的康桥！\n");
		
		System.out.println(sw.toString());
		try {
			bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\workplace1\\zbkq.txt",false), "UTF-8"));
			while ((hasRead = sr.read(cbuf)) > 0) {
				System.out.println(new String(cbuf,0,hasRead));
				bw.write(new String(cbuf,0,hasRead));
			}
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (null != sr) {
				sr.close();
			}
			if (null != bw) {
				try {
					bw.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
