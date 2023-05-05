package FileHandling;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterReader {
	public static void main(String[] args) throws IOException {
//		String msg = "file handling by file witer and reader class";
//		FileWriter fr = new FileWriter("t2.txt");
//		fr.write(msg);
//		fr.flush();
//		fr.close();
//		System.out.println("file written successfully");
		
		FileReader fr = new FileReader("t2.txt");
		int i;
		while((i = fr.read())!=-1) {
			System.out.print((char)i);
		}
	}
}
