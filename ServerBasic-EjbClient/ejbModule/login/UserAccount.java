package login;


public class UserAccount {

	private int id = 0;

	private String email;
	private String firstName;
	private String surName;
	private String phoneNo;
	private String facebookAcc;
	private String twitter;

	public UserAccount() {
	}

	public UserAccount(final String email, final String firstName,
			final String surName, final String phoneNo,
			final String facebookAcc, final String twitter) {
		this.email = email;
		this.firstName = firstName;
		this.surName = surName;
		this.phoneNo = phoneNo;
		this.facebookAcc = facebookAcc;
		this.twitter = twitter;
	}

	public int getId() {
		return id;
	}

	private void setId(final int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(final String email) {
		this.email = email;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(final String firstName) {
		this.firstName = firstName;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(final String surName) {
		this.surName = surName;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(final String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getFacebookAcc() {
		return facebookAcc;
	}

	public void setFacebookAcc(final String facebookAcc) {
		this.facebookAcc = facebookAcc;
	}

	public String getTwitter() {
		return twitter;
	}

	public void setTwitter(final String twitter) {
		this.twitter = twitter;
	}

}
