package io.nio;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.CharBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;

public class FileChannelTest {
	public static void main(String[] args) throws Exception {
		File f = new File("src//io//nio//FileChannelTest.java");
		FileChannel inChannel = null;
		FileChannel outChannel = null;
//		FileInputStream ff = new FileInputStream(f);
//		byte[] b = new byte[10240];
//		int hasRead;
//		while ((hasRead = ff.read(b)) > 0) {
//			System.out.println(new String(b,0,hasRead));
//		}
		try {
			//创建FileInputStream,以该文件的输入流创建FileChannel
			inChannel = new FileInputStream(f).getChannel();
			
			//将FileChannel里的数据全部映射成ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, f.length());
			//使用GBK字符集来创建解码器
			Charset charset = Charset.forName("UTF-8");
			//以FileOutputStream创建FileBuffer,以控制输出
			outChannel = new FileOutputStream("src//io//nio//FileChannelTest.txt").getChannel();
			outChannel.write(buffer);
			buffer.clear();
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(charBuffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			inChannel.close();
			outChannel.close();
		}
	}
}
