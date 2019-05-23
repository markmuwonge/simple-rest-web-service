package com.qa.AccountApplication;

import static javax.transaction.Transactional.TxType.REQUIRED;
import static javax.transaction.Transactional.TxType.SUPPORTS;

import java.util.Collection;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

public class AccountRepoDB {
	
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;
	
	public Account getAccount(int id) {
		return manager.find(Account.class, id);
	}


}
