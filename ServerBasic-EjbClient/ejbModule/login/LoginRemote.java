package login;

import javax.ejb.Remote;

@Remote
public interface LoginRemote {

	void addUser(UserAccount newUser);

	UserAccount getUser(String email);

}
