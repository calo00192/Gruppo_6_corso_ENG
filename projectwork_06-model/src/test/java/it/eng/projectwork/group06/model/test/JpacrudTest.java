package it.eng.projectwork.group06.model.test;

import java.util.List;

import javax.persistence.Query;

import org.junit.Test;

import it.eng.projectwork.group06.model.Supplier;

public class JpacrudTest extends JPAHibernateTest {

	
	@Test
	public void test1() {
		em.getTransaction().begin();
		
		
		Supplier u = new Supplier();
		u.setName("Tizio");
		u.setSurname("Caio");
		
		em.persist(u);
		
		
		em.getTransaction().commit();
		
	}
	
	@Test
	public void test2() {
		
		Query query = em.createQuery("SELECT u FROM Supplier u");
		List<Supplier> users = query.getResultList();
		for(Supplier user : users) {
			System.out.println(user.getName());
		}
		 
	}
	
	
}
