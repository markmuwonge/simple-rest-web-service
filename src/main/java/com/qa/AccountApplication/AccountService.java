package com.qa.AccountApplication;

import java.util.ArrayList;

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
}
