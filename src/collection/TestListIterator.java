package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class TestListIterator {
	public static void main(String[] args) {
		String[] books = { "Struts2", "轻量级" };
		List booksList = new ArrayList();
		for (int i = 0; i < books.length; i++) {
			booksList.add(books[i]);
		}
		ListIterator lit = booksList.listIterator();
		while (lit.hasNext()) {
			System.out.println(lit.next());
			lit.add("--分隔符--");
		}
		System.out.println("-->反向迭代<--");
		while (lit.hasPrevious()) {
			System.out.println(lit.previous());
		}
	}

}
