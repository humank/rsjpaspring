package model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ACCOUNT database table.
 * 
 */
@Entity
@NamedQuery(name="Account.findAll", query="SELECT a FROM Account a")
public class Account implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private long accountid;

	private String name;

	public Account() {
	}

	public long getAccountid() {
		return this.accountid;
	}

	public void setAccountid(long accountid) {
		this.accountid = accountid;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}