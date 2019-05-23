package com.qa.AccountApplication;

import java.util.List;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Transactional
public class AccountRepoDB {

	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	public Account getAccount(int id) {
		return manager.find(Account.class, id);
	}

	public List<Account> getAllAccounts() {
		return manager.createQuery("SELECT a from Account a", Account.class).getResultList();
	}

	public String createAnAccount(String accountJSONFormat) {
		Account anAccount = util.fromJSON(accountJSONFormat, Account.class);
		manager.persist(anAccount);

		return "Account sucessfully added";
	}
	
	public String updateAnAccount(String accountJSONFormat) {
		Account anAccount = util.fromJSON(accountJSONFormat, Account.class);
		manager.merge(anAccount);
		
		return "Account sucessfully updated";
	}
	public String deleteAnAccount(int id) {
		
		manager.remove(manager.find(Account.class, id));
		
		return "Account sucessfully deleted";
	}
}
