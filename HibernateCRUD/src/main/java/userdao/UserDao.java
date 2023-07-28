package userdao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import connection.DBConnection;
import model.User;

public class UserDao {
	public static void insertUser(User u) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		session.save(u);
		tx.commit();	
		session.close();
	}

	public static boolean checkEmail(String email) {
		boolean flag = false;
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql = "FROM User u where u.email=:email";
		Query query = session.createQuery(hql);
		query.setParameter("email", email);
		List results = query.list();
		if (!results.isEmpty()) {
			flag = true;
			System.out.println(flag);
		}
		tx.commit();
		session.close();
		return flag;
	}

	public static User userLogin(User u) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql = "FROM User u where u.email=:email and u.password=:password";
		Query query = session.createQuery(hql);
		query.setParameter("email", u.getEmail());
		query.setParameter("password", u.getPassword());
		List results = query.list();
		User u1 = (User) results.get(0);
		tx.commit();
		session.close();
		return u1;
	}

	public static List<User> getAllUser() {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql = "FROM User";
		Query query = session.createQuery(hql);
		List results = query.list();
		System.out.println(results);

		tx.commit();
		session.close();
		return results;
	}

	public static User getDataById(int id) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql = "FROM User u where u.id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("id", id);
		List results = query.list();
		User u1 = (User) results.get(0);
		tx.commit();
		session.close();
		return u1;
	}

	public static void updateUser(User u) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		String hql = "UPDATE Employee set name=:name,contact=:contact,address=:address,email=:email,password=:password where id=:id";
		Query query = session.createQuery(hql);
		query.setParameter("name", u.getName());
		query.setParameter("contact", u.getContact());
		query.setParameter("address", u.getAddress());
		query.setParameter("email", u.getEmail());
		query.setParameter("password", u.getPassword());
		query.setParameter("id", u.getId());
		int result = query.executeUpdate();
		System.out.println("Rows affected: " + result);
		tx.commit();
		session.close();
	}
	public static void deleteUser(int id) {
		Session session = new DBConnection().getSession();
		Transaction tx = session.beginTransaction();
		User u  = UserDao.getDataById(id);
		session.delete(u);
		tx.commit();
		session.close();
	}
}
