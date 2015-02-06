package login.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import login.models.UserAccounts;

public class Test {

	/**
	 * @param args
	 */
	public static void main(final String[] args) {
		final EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("ServerBasic-Jpa");

		final UserAccounts robbie = new UserAccounts("robbiebyr@gmail.com",
				"Robbie", "Byrne", "0861718449", "", "");

		final EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		em.persist(robbie);

		em.getTransaction().commit();
		em.close();
	}

}
