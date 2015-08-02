package collection;

import java.util.TreeSet;
import java.util.Date;

public class TestTreeSetError2 {
	public static void main(String[] args) {
		TreeSet ts = new TreeSet();
		ts.add(new String("Struts"));
		ts.add(new Date());//Date对象无法与无法与字符串对象比较 引发异常
	}

}
