package com.qa.AccountApplication;

import javax.inject.Inject;

public class AccountService {
	
	@Inject
	JSONUtil json;
	
	@Inject
	AccountRepoDB repo;
	
	public String getAccount(int number) 
	{
		return this.json.toJSON(this.repo.getAccount(number));
	}
}
