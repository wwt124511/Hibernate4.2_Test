package entity;

/**
 * WwtUser entity. @author MyEclipse Persistence Tools
 */

public class WwtUser implements java.io.Serializable {

	// Fields

	private String userId;
	private String userName;

	// Constructors

	/** default constructor */
	public WwtUser() {
	}

	/** full constructor */
	public WwtUser(String userName) {
		this.userName = userName;
	}

	// Property accessors

	public String getUserId() {
		return this.userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

}