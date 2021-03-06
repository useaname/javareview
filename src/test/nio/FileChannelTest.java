package test.nio;

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
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		FileChannel inChannel = null;
		FileChannel outChannel = null;
		try {
			//构建一个File对象
			File file = new File("src//test//nio//FileChannelTest.java");
			//构建FileInputStream对象,来获取Channel
			inChannel = new FileInputStream(file).getChannel();
			//通过Channel对象来获取buffer(发送到Channel中的所有对象必须先放到Buffer中)
			//MappedByteBuffer继承自ByteBuffer
			MappedByteBuffer buffer = inChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
//			System.out.println("初始pos:" + buffer.position());
//			System.out.println("初始limit:" + buffer.limit());
//			System.out.println("初始capacity:" + buffer.capacity());
			//flip()将limit设置为position所在的位置,将position设置为0
//			buffer.flip();
//			System.out.println("flip after pos:" + buffer.position());
//			System.out.println("flip after limit:" + buffer.limit());
//			System.out.println("flip after capacity:" + buffer.capacity());
			Charset charset = Charset.forName("UTF-8");
			CharsetDecoder decoder = charset.newDecoder();
			CharBuffer charBuffer = decoder.decode(buffer);
			System.out.println(buffer);
			System.out.println("=======================================================================");
			buffer.clear();
			System.out.println(charBuffer);
			
			//通过outChannel向指定位置写入文件内容
			outChannel = new FileOutputStream("src//test//nio//FileChannelTest.txt").getChannel();
			outChannel.write(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				if (null != inChannel) {
					inChannel.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
