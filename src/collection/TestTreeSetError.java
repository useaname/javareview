package collection;

import java.util.SortedSet;
import java.util.TreeSet;

class Err{
	
}
public class TestTreeSetError {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new Err());
		ts.add(new Err());//Err类没有实现Comparable接口，此处抛出异常ClassCastException
	}
}
