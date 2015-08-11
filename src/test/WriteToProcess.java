package test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

public class WriteToProcess {
	public static void main(String[] args) {
		PrintStream ps = null;
		try {
			Process p = Runtime.getRuntime().exec("java ReadStand");
			ps = new PrintStream(p.getOutputStream());
			BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
			String content;
			while ((content = br.readLine()) != null) {
				System.out.println(content);
			}
			ps.println("普通字符串");
			ps.println(new WriteToProcess());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (null != ps) {
				ps.close();
			}
		}
	}
}
class ReadStand {
	public static void main(String[] args) {
		PrintStream ps = null;
		Scanner sc = new Scanner(System.in);
		try {
			ps = new PrintStream("\\src\\test\\out.txt");
			sc.useDelimiter("\n");
			while (sc.hasNext()) {
				ps.print("键盘输入的内容是:" + sc.next());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			sc.close();ps.close();
		}
	}
}