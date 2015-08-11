package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class TestSort {
	public static void main(String[] args) {
		Random r = new Random();
		List list  = new ArrayList();
		for(int i = 0;i<10;i++){
			list.add(r.nextInt(1000));
		}
		Collections.sort(list);
		Iterator ite = list.iterator();
		int count = 0;
		while(ite.hasNext()){
			++count;
			System.out.println(count+"-->"+ite.next());
		}
	}
}
