package collection;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		Set books = new HashSet();
		books.add("Struts2权威指南");
		boolean res = books.add("Struts2权威指南");
		System.out.println(books);
	}
}
