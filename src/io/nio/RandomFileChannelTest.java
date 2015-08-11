package io.nio;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


public class RandomFileChannelTest {
	public static void main(String[] args) {
		FileChannel channel = null;
		try {
			File file = new File("src/io/nio/RandomFileChannelTest.java");
			RandomAccessFile raf = new RandomAccessFile(file, "rw");
			channel = raf.getChannel();
			ByteBuffer buffer = channel.map(FileChannel.MapMode.READ_ONLY,0	, file.length());
			channel.position(file.length());
			channel.write(buffer);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				channel.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
	}
}
