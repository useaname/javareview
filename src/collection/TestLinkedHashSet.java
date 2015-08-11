package collection;
import java.util.LinkedHashSet;
/**
 * 元素顺序与添加顺序一致
 * **/
public class TestLinkedHashSet {
	public static void main(String[] args) {
		LinkedHashSet books = new LinkedHashSet();
		books.add("Struts2");
		books.add("轻量级");
		books.remove("Struts2");
		books.add("Struts2");
		System.out.println(books);
	}
}
