package com.qa.AccountApplication;

import javax.inject.Inject;

public class AccountService {

	@Inject
	JSONUtil json;

	@Inject
	AccountRepoDB repo;

	String allAccountObjectsAsJson = "";

	public String getAccount(int number) {
		return this.json.toJSON(this.repo.getAccount(number));
	}

	public String getAllAccounts() {

		this.repo.getAllAccounts().stream()
				.forEach(x -> allAccountObjectsAsJson = allAccountObjectsAsJson + this.json.toJSON(x) + "\n");
		return allAccountObjectsAsJson.trim();
	}

	public String createAnAccount(String accountJSONFormat) {

		return this.repo.createAnAccount(accountJSONFormat);
	}
	
	public String updateAnAccount(String accountJSONFormat) {

		return this.repo.updateAnAccount(accountJSONFormat);
	}
	
	public String deleteAnAccount(int number) {

		return this.repo.deleteAnAccount(number);
	}

}
