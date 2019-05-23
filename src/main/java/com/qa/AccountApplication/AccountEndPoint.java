package com.qa.AccountApplication;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

@Path("/account")
public class AccountEndPoint {

	@Inject
	private AccountService service;

	@GET
	@Path("/{id}")
	public String getAccount(@PathParam("id") Integer id) {
		return service.getAccount(id);
		
		
	}

}
