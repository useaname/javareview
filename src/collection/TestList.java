package collection;

import java.util.ArrayList;
import java.util.List;

public class TestList {
	public static void main(String[] args) {
		List books = new ArrayList();
		books.add("轻量级...");
		books.add("权威指南...");
		books.add("宝典...");
		System.out.println(books);
		books.add(1, new String("敏捷开发..."));//在第二个位置插入新对象
		for (int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i));
		}
		books.remove(2);//删除第三个元素
		System.out.println(books.indexOf(new String("敏捷开发...")));
		books.set(1, new String("权威指南..."));
		System.out.println(books);
		System.out.println(books.subList(1, 2));
	}

}
