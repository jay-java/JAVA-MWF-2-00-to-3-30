package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//file handling can be done by file input output stream class
// and fileReader and fileWriter class
//to store data or output in any file we are having this concept called 
//file handling
public class FileInputOutputStream {
	public static void main(String[] args) throws IOException {
//		String msg = "file handling by file input output stream";
//		FileOutputStream fos = new FileOutputStream("t1.txt");
//		byte[] b = msg.getBytes();
//		fos.write(b);
//		fos.flush();
//		fos.close();
//		System.out.println("file written");
		
		FileInputStream fis = new FileInputStream("t1.txt");
		int i;
		while((i = fis.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
