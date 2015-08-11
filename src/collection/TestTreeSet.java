package collection;

import java.util.TreeSet;

class Z implements Comparable {
	int age;

	public Z(int age) {
		this.age = age;
	}

	@Override
	public boolean equals(Object obj) {
		return false;
	}

	@Override
	public int compareTo(Object o) {
		return 1;
	}

}

public class TestTreeSet {
	public static void main(String[] args) {
		TreeSet set = new TreeSet();
		Z z1 = new Z(6);
		set.add(z1);
		//输出true 表明成功
		System.out.println(set.add(z1));
		System.out.println(set);
		((Z)(set.first())).age = 9;
		System.out.println(((Z)(set.last())).age);
	}

}
