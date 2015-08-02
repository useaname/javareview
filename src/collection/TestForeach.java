package collection;

import java.util.Collection;
import java.util.HashSet;
/**
 *使用foreach迭代元素集合 
 */
public class TestForeach {
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		books.add("基于J2EE的Ajax宝典");
		for(Object obj : books){
			String book = (String)obj;
			System.out.println(book);
			if("Struts2权威指南".equals(book)){
				books.remove(book);
			}
			System.out.println(books);
		}
	}
}
