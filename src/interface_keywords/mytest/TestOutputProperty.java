package interface_keywords.mytest;

import interface_keywords.Output;

public class TestOutputProperty {
	public static void main(String[] args) {
		//访问另一个包中的Output接口的MAX_CACHE_LINE属性
		System.out.println(Output.MAX_CACHE_LINE);
		//重新为final变量赋值引起错误
		//Output.MAX_CACHE_LINE = 3;
	}
}
