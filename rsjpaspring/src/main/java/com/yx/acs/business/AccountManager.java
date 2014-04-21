package com.yx.acs.business;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

import model.Account;

public class AccountManager {

	@PersistenceUnit(unitName="rsjpaspring")
	private EntityManagerFactory emf;
	
	public String getAccounts() {

		return "all the account are listed here !!!";
	}
	public void addAccount(Account ac){
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(ac);
		em.getTransaction().commit();
		em.close();
		
	}

}
