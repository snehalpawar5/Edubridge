package com.hibernate.Firsthb;

import java.util.*;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


//public class App 
//{
//    public static void main( String[] args )
//    {
//    	College col = null;
//		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
//		SessionFactory sf = c.buildSessionFactory();
//		Session se = sf.openSession();
//		Transaction tx = se.beginTransaction();
//		
//		Query q = se.createQuery("from College where fees<7500");    
//		q.setCacheable(true);
//		col = (College)q.uniqueResult();
//		System.out.println(col);
//		
//		tx.commit();
//		se.close();
//		
//		Session se1 = sf.openSession();
//        Transaction ty = se1.beginTransaction();
//        Query q1 = se1.createQuery("from College where fees<7500");
//        q1.setCacheable(true);
//		col = (College)q1.uniqueResult();
//		System.out.println(col);
//		
//		ty.commit();
//		se.close();
//		
//    }
//}



/*public class App  //fetching/creating data from database using cache
{
    public static void main( String[] args )
    {
    	College col = null;
		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
		SessionFactory sf = c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		Query q = se.createQuery("from College where fees<7500");    
		col = (College)q.uniqueResult();
		System.out.println(col);
		
		tx.commit();
		se.close();
		
		Session se1 = sf.openSession();
        Transaction ty = se1.beginTransaction();
        Query q1 = se1.createQuery("from College where fees<7500");    
		col = (College)q1.uniqueResult();
		System.out.println(col);
		
		ty.commit();
		se.close();
		
    }
}
*/
/*public class App 
{
    public static void main( String[] args )
    {
    	College col = null;
		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
		SessionFactory sf = c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		col = (College)se.get(College.class, 7);
		System.out.println(col);                              // Cache hibernate
		tx.commit();
		se.close();
		
		Session se1 = sf.openSession();
        Transaction ty = se1.beginTransaction();
        col = (College)se1.get(College.class, 7);
		System.out.println(col);
		ty.commit();
		se.close();
		
    }
}*?
/*public class App 
{
    public static void main( String[] args )
    {
		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
		SessionFactory sf = c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		
		
		Query q = se.createQuery("select name,fees from College where id > 6");
		List<Object[]> col = q.list();
		
		for(Object[] o: col)
		{
			System.out.println(o[0] + ":" + o[1]);          //using object
		}
		
		
		tx.commit();
		
    }
}
*/





/*public class App 
{
    public static void main( String[] args )
    {
		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
		SessionFactory sf = c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		
		
		Query q = se.createQuery("select sum(fees) from College where fees > 6000");
		 Long st = (Long) q.uniqueResult();
		
		System.out.println(st);
		
		tx.commit();
		
    }
}*/
/*public class App 
{
    public static void main( String[] args )
    {
		Configuration c = new Configuration().configure().addAnnotatedClass(hcollege.class);
		SessionFactory sf = c.buildSessionFactory();
		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();
		
		
		
		Query q = se.createQuery("from hcollege");
		List<hcollege> st = q.list();                            // hibernate1 : to fetch all data from table/databases
		for(hcollege s:st) {
			System.out.println(s);
		}
		
		tx.commit();
		
    }
}*/
//public class App 
//{
//    public static void main( String[] args )
//    {
//		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
//		SessionFactory sf = c.buildSessionFactory();
//		Session se = sf.openSession();
//		Transaction tx = se.beginTransaction();
//		College co = null;
//		                                                                             //get and load
//		co = (College)se.get(College.class,5);
//		System.out.println(co);
//
//		
//		tx.commit();
//		
//    }
//}

//public class App 
//{
//    public static void main( String[] args )
//    {
//		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
//		SessionFactory sf = c.buildSessionFactory();
//		Session se = sf.openSession();                                                
//		Transaction tx = se.beginTransaction();
//	                                                           //from this program below all are persistent state in life cycle
//		College co = new College();
//		co.setId(6);
//		co.setName("Nikita");
//		co.setFees(5000);
//		
//		//se.remove(co);
//		se.save(co);
//	
//		tx.commit();
//		
//    }
//}


//public class App 
//{
//    public static void main( String[] args )
//    {
//		Configuration c = new Configuration().configure().addAnnotatedClass(College.class);
//		SessionFactory sf = c.buildSessionFactory();
//		Session se = sf.openSession();
//		Transaction tx = se.beginTransaction();
//	
//		College co = new College();
//		co.setId(9);
//		co.setName("Devanand");
//		co.setFees(6500);
//		
//		se.save(co);
//		//co.setName("Kiara");
//		//se.detach(co);
//		
//		tx.commit();
//		co.setName("Kiara");
//		se.detach(co);
//    }
//}


//public class App 
//{
//public static void main( String[] args )
//{
//	course ca = new course();
//	ca.setId(99);
//	ca.setCname("MBA");
//	
//	std s = new std();
//	s.setId(1);
//	s.setName("kavya");
//	s.setMarks(89);
//	s.getCname().add(ca);
//	
//	ca.getStud().add(s);
//	
//	Configuration c = new Configuration().configure().addAnnotatedClass(std.class).addAnnotatedClass(course.class);
//	SessionFactory sf = c.buildSessionFactory();
//	Session se = sf.openSession();
//	Transaction tx = se.beginTransaction();
//	
//	se.save(ca);
//	se.save(s);
//	
//	tx.commit();
//}
//}
