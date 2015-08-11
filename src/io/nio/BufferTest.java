package io.nio;

import java.nio.CharBuffer;

public class BufferTest {
	public static void main(String[] args) {
		CharBuffer buff = CharBuffer.allocate(8); 
		System.out.println("capacity:" + buff.capacity());
		System.out.println("limit:" + buff.limit());
		System.out.println("position:" + buff.position());
		
		buff.put('a');
		buff.put('b');
		buff.put('c');
		
		System.out.println("---------------加入三个元素后-----------------------");
		System.out.println("position:" + buff.position());
		buff.flip();
		System.out.println("filip()后,limit:" + buff.limit());
		System.out.println("position:" + buff.position());
		System.out.println("第一个元素(position) :" + buff.get());
		System.out.println("取出一个元素后,position:" + buff.position());
		//clear()
		buff.clear();
		System.out.println("---- 执行clear() ----");
		System.out.println("limit:" + buff.limit());
		System.out.println("position:" + buff.position());
		System.out.println("缓冲区并没有被清除:" + buff.get(2));
		System.out.println("执行绝对读取后:,position:" + buff.position());
	}
}
