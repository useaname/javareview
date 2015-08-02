package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class TestIteratorError {
	public static void main(String[] args) {
		Collection books = new HashSet();
		books.add("轻量级J2EE企业应用实战");
		books.add("Struts2权威指南");
		books.add("基于J2EE的Ajax宝典");
		Iterator ite = books.iterator();
		while(ite.hasNext()){
			String book = (String)ite.next();
			if("Struts2权威指南".equals(book)){
				//使用Iterator迭代过程中，不可修改集合元素。下面代码引发异常
				books.remove(book);
			}
		}
	}
}
