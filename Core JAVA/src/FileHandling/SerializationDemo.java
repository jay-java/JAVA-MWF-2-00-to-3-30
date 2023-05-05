package FileHandling;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class StudentData implements Serializable{
	private int id;
	private String name;
	private double per;
	private String address;
	public StudentData(int id,String name,double per,String address) {
		this.id=id;
		this.name=name;
		this.per=per;
		this.address=address;
	}
	@Override
	public String toString() {
		return "id = "+id+" name : "+name+" per : "+per+" address : "+address;
	}
}
class Employee{
	
}
public class SerializationDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		StudentData s1 = new StudentData(1, "anvesh", 67.6, "ahmedabad");
		
//		FileOutputStream fos = new FileOutputStream("serializable.txt");
//		ObjectOutputStream oos = new ObjectOutputStream(fos);
//		oos.writeObject(s1);
//		oos.flush();
//		oos.close();
//		System.out.println("object written successfully");
		
		FileInputStream fis = new FileInputStream("serializable.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		StudentData s = (StudentData)ois.readObject();
		System.out.println(s);
	}
}
