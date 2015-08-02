package collection;

import java.util.ArrayList;
import java.util.List;
class Aa{
	@Override
	public boolean equals(Object obj) {
		return true;
	}
}

public class TestList2 {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add(new String("轻量级J2EE企业开发"));
		books.add(new String("Struts2权威指南"));
		books.add(new String("J2EE"));
		System.out.println(books);
		books.remove(new Aa()); //程序试图删除一个Aa对象。List将会调用该Aa对象的equals方法一次与集合元素比较
		//如果该equals方法返回true，List将会删除该元素
		System.out.println(books);
		books.remove(new Aa());
		System.out.println(books);
	}

}
