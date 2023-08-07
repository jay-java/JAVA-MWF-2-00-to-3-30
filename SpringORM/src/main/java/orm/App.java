package orm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		ApplicationContext con = new ClassPathXmlApplicationContext("orm/config.xml");
		Dao dao = (Dao)con.getBean("dao");
//		User u =  new User(2, "python1234", 987654321, "ahmedabad");
//		dao.insertUpdateUser(u);
//		System.out.println("done");
		List<User> list = dao.getAllUser();
		System.out.println(list);
	}
}
