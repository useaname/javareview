package test;

import java.io.UnsupportedEncodingException;

public class String_GetBytes {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String str = "大脚好";
		String tempStr = " ";
		tempStr = new String(str.getBytes("ISO-8859-1"),"GBK");
		tempStr = tempStr.trim();
		System.out.println(tempStr);
	}
}
