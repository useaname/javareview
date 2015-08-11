package test.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;

public class RandomFileChannelTest {
	public static void main(String[] args) throws Exception {
		
		File file = new File("src//test//nio//RandomFileChannelTest.java");
		RandomAccessFile raf;
		FileChannel randomChannel = null;
		try {
			raf = new RandomAccessFile(file, "rw");
			randomChannel = raf.getChannel();
			MappedByteBuffer buffer = randomChannel.map(FileChannel.MapMode.READ_ONLY, 0, file.length());
			//Channel的文件指针移到最后
			randomChannel.position(file.length());
			//向buffer中输出所有数据
			randomChannel.write(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			randomChannel.close();
		}
		
	}
}
