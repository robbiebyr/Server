package user;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import login.LoginRemote;
import login.UserAccount;

@Stateless
@LocalBean
public class LoginBean implements LoginRemote {

	@PersistenceContext
	protected EntityManager em;

	@Override
	public void addUser(final UserAccount newUser) {
		em.persist(newUser);
	}

	@Override
	public UserAccount getUser(final String email) {
		final Query q = em.createNamedQuery("getUserP");
		q.setParameter(1, email);
		return (UserAccount) q.getSingleResult();
	}

}
