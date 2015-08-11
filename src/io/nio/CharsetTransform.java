package io.nio;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;



public class CharsetTransform {
	public static void main(String[] args) throws Exception {
		//创建简体中文对应的Charset
		Charset cn = Charset.forName("GBK");
		//创建cn对象的对应编码器,解码器
		CharsetEncoder cnEncoder = cn.newEncoder();
		CharsetDecoder cnDecoder = cn.newDecoder();
		//创建一个容量为8的CharBuffer对象
		CharBuffer charBuffer = CharBuffer.allocate(8);
		//CharBuffer中放入元素 
		charBuffer.put("孙");
		charBuffer.put("悟");
		charBuffer.put("空");
		//调用filp() 
		charBuffer.flip();
		
		
		ByteBuffer bbuffer = cnEncoder.encode(charBuffer);
		for(int i = 0;i < bbuffer.capacity() ; i++) {
			System.out.print(bbuffer.get(i));
		}
		
		System.out.println("\n" + cnDecoder.decode(bbuffer));
	}
}
