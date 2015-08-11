package test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BufferedReaderTest {
	public static void main(String[] args) {
		
		BufferedReader br  = null;
		
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		
		String newLine = null;
		
		FileOutputStream fos = null;
		
		
		try {
			isr = new InputStreamReader(new FileInputStream("E:\\workplace1\\review\\demo.txt"), "gbk");
			br = new BufferedReader(isr);
			//覆盖的方式写入文件 节点流
			fos = new FileOutputStream("E:\\workplace1\\review\\demo111.txt",false);
			//处理流 指定编码
			bw = new BufferedWriter(new OutputStreamWriter(fos, "UTF-8"));
			
			while ((newLine = br.readLine()) != null) {
				System.out.println(newLine);
				bw.write(newLine);
			}
			bw.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
