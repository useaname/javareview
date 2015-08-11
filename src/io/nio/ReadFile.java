package io.nio;

import java.nio.charset.Charset;
import java.util.SortedMap;

public class ReadFile {
	public static void main(String[] args) {
		SortedMap<String, Charset> map =  Charset.availableCharsets();
		for (String string : map.keySet()) {
			System.out.println(map.get(string));
		}
	}
}
