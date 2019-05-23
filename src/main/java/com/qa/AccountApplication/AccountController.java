package com.qa.AccountApplication;

import javax.inject.Inject;
import javax.ws.rs.Path;

@Path("/account")
public class AccountController {
	
	@Inject 
	private Account account;

}
