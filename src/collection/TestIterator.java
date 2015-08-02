package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIterator {
	public static void main(String[] args) {
		//创建一个集合
		Collection books = new HashSet();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		books.add("基于J2EE的Ajax宝典");
		Iterator ite = books.iterator();
		while(ite.hasNext()){
			String book = (String)ite.next();
			System.out.println(book);
			if("Struts2权威指南".equals(book)){
				ite.remove();
			}
			/**
			 *对迭代变量book进行赋值，再次输出books集合时
			 *集合里的值没有任何改变。由此得出：
			 *使用Iterator对集合元素进行迭代时，Iterator并
			 *不是把集合本身传给了迭代变量，而是把集合元素的值传给了迭代
			 *变量，所以修改迭代变量的值对元素本身没有任何改变。
			 */
			//对book变量赋值 不会 改变集合与元素本身
			book = "测试字符串";
		}
		System.out.println(books);
	}
}
