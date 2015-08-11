package io;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile2 {
	public static void main(String[] args) {
		FileWriter fw = null;
		try {
			fw = new FileWriter("new.txt");
			fw.write("白日依山尽,\r\n");
			fw.write("黄河入海流.\r\n");
			fw.write("欲穷千里目,\r\n");
			fw.write("更上一层楼.");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if (null != fw) {
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
