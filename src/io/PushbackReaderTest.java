package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

public class PushbackReaderTest {
	public static void main(String[] args) {
		PushbackReader pr = null;
		
		try {
			pr = new PushbackReader(new FileReader("E:\\workplace1\\review\\src\\io\\PushbackReaderTest.java"), 64);
			char[] buf = new char[32];
			//保存上次读取的字符串内容
			String lastContent = "";
			int hasRead = 0;
			while ((hasRead = pr.read(buf)) > 0) {
				//读取到内容转换成字符串
				String content = new String(buf,0,hasRead);
				int targetIndex = 0;
				//将上一次内容和本次内容拼起来 检查是否包含目标字符串
				//如果包含目标字符串
				if ((targetIndex = (lastContent + content).indexOf("new PushbackReader")) > 0) {
					//将本次内容上次内容一起退回到推回缓冲区
					pr.unread((lastContent + content).toCharArray());
					//再次读取指定程度的内容(目标字符串之前的内容)
					pr.read(buf,0,targetIndex);
					//打印读取内容
					System.out.println(new String(buf,0,targetIndex));
					System.exit(0);
				} else {
					System.out.println(lastContent);
					lastContent = content;
				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
