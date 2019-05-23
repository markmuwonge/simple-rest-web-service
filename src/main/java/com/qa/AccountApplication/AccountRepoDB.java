package com.qa.AccountApplication;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AccountRepoDB {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public Account getAccount(int id) {
		return manager.find(Account.class, id);
	}


}
