package test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.WwtUser;

import util.HibernateSessionFactory;

public class HibernateTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		Session session = HibernateSessionFactory.getSession();
		session.getTransaction().begin();
		
		WwtUser u = new WwtUser();
		u.setUserId("8");
		u.setUserName("888");
		
		session.save(u);
		session.getTransaction().commit();
		System.out.println("添加成功！");
	}

}
