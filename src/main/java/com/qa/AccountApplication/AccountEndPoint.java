package com.qa.AccountApplication;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/account")
public class AccountEndPoint {

	@Inject
	private AccountService service;

	@GET
	@Path("/getAccount/{id}")
	public String getAccount(@PathParam("id") Integer id) {
		return service.getAccount(id);
	}

	@GET
	@Path("/getAllAccounts")
	public String getAllAccounts() {

		return service.getAllAccounts();
	}

	@POST
	@Path("/createAnAccount")
	public String createAnAccount(String accountJSONFormat) {

		return service.createAnAccount(accountJSONFormat);
	}

	@POST
	@Path("/updateAnAccount")
	public String updateAnAccount(String accountJSONFormat) {

		return service.updateAnAccount(accountJSONFormat);
	}

	@GET
	@Path("/deleteAccount/{id}")
	public String deleteAnAccount(@PathParam("id") Integer id) {

		return service.deleteAnAccount(id);
	}

}
