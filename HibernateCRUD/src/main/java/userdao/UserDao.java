package userdao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import connection.DBConnection;
import model.User;

public class UserDao {
	public static void insertUser(User u) {
		SessionFactory sf = DBConnection.createConnection();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();
		session.close();
		sf.close();
	}
}
