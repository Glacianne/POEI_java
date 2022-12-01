package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.User;
import util.HibernateUtil;

public class Main {

	public static void addUser(User user) {
		Session session = HibernateUtil.getSessionfactory().openSession();

		Transaction trx = session.beginTransaction();

		try {
			session.persist(user);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
			System.out.println(e.getMessage());
		}
		session.close();
	}

	public static void updateUser(User user) {
		Session session = HibernateUtil.getSessionfactory().openSession();

		Transaction trx = session.beginTransaction();

		try {
			session.update(user);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
			System.out.println(e.getMessage());
		}
		session.close();
	}

	public static void saveOrUpdateUser(User user) {
		Session session = HibernateUtil.getSessionfactory().openSession();

		Transaction trx = session.beginTransaction();

		try {
			session.saveOrUpdate(user);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
		}
	}
	
	public static void deleteUser(User user) {
		Session session = HibernateUtil.getSessionfactory().openSession();

		Transaction trx = session.beginTransaction();

		try {
			session.delete(user);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
		}
		session.close();
	}

	public static User getUser(int id) {
		Session session = HibernateUtil.getSessionfactory().openSession();
		Transaction trx = session.beginTransaction();
		User ret = null;
		try {
			session.get(User.class, id);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
		}
		session.close();
		return ret;
	}

	public static void main(String[] args) {
		User user1 = new User("Goldman", "Jean-Jacques", 80);
		addUser(user1);
		deleteUser(user1);
	}

}
