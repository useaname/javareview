package collection;

import java.util.HashSet;
import java.util.Iterator;

class R {
	int count;

	public R(int count) {
		this.count = count;
	}

	public String toString() {
		return "R(属性：" + count + ")";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof R) {
			R r = (R) obj;
			if (r.count == this.count) {
				return true;
			}
		}
		return false;
	}

	public int hashCode(){
		return this.count;
	}
}

public class TestHashSet2 {
	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(new R(5));
		hs.add(new R(-3));
		hs.add(new R(9));
		hs.add(new R(-2));
		//打印集合
		System.out.println(hs);
		Iterator it = hs.iterator();
		R first = (R)it.next();
		//System.out.println(first);
		first.count = -3;
		System.out.println(hs);
		hs.remove(new R(-3));
		System.out.println(hs.contains(new R(-3)));
		System.out.println(hs.contains(new R(5)));
	}
}
