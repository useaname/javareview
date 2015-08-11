package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestCollection {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("孙悟空");
		c.add(6);
		System.out.println(c.size());
		c.remove(6);
		System.out.println(c.size());
		System.out.println(c.contains("孙悟空"));
		c.add("J2EE");
		System.out.println(c);
		Collection books = new HashSet();
		books.add("轻量级");
		books.add("strut2");
		//c集合里是否完全包含books集合
		c.clear();
		System.out.println(c.containsAll(books));
		System.out.println(books);
	}
}
