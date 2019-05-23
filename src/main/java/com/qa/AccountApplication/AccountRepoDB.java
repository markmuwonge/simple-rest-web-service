package com.qa.AccountApplication;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class AccountRepoDB {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	public Account getAccount(int id) {
		return manager.find(Account.class, id);
	}

	public List<Account> getAllAccounts() {
		return manager.createQuery("SELECT a from Account a", Account.class).getResultList();

	}
}
