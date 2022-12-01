package client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Personne;
import entity.User;
import util.HibernateUtil;

public class Main {

	public static void addPersonne(Personne personne) {
		Session session = HibernateUtil.getSessionfactory().openSession();

		Transaction trx = session.beginTransaction();

		try {
			session.save(personne);
			trx.commit();
		} catch (Exception e) {
			trx.rollback();
		}
	}
	
	

	public static void main(String[] args) {
		addPersonne(new Personne("marley", "bob"));
	}

}
