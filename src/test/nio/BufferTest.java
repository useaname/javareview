package test.nio;

import java.nio.CharBuffer;

public class BufferTest {
	public static void main(String[] args) {
		CharBuffer buffer = CharBuffer.allocate(8);
		System.out.println(buffer.position());
		System.out.println(buffer.capacity());
		System.out.println(buffer.limit());
		
		buffer.put('a');
		buffer.put('b');
		buffer.put('c');
		buffer.put('d');
		System.out.println("-----------------------");
		System.out.println(buffer.position());
		System.out.println("------------------------");
		buffer.flip();
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		System.out.println("-------------------------");
		System.out.println("取出一个元素(pos=0):" + buffer.get());
		System.out.println(buffer.position());
		System.out.println("-----------------执行clear()------------------------");
		System.out.println(buffer.limit());
		System.out.println(buffer.position());
		System.out.println("------------------------------");
		System.out.println(buffer.get(2));
		System.out.println(buffer.position());
	}
}
