package com.yx.acs.rs;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import model.Account;

import org.springframework.beans.factory.annotation.Autowired;

import com.yx.acs.business.AccountManager;

@Path(value = "acs")
public class AccountService {

	@Autowired
	AccountManager acctMgr;

	// @GET
	// @Consumes({ MediaType.APPLICATION_JSON })
	// @Produces({ MediaType.APPLICATION_JSON })
	// public String getAccounts() {
	//
	// return acctMgr.getAccounts();
	// }

	@GET
	//@Path("/add")
	public Response addAccount(@QueryParam("accountid") long acid,
			@QueryParam("name") String name) {

		Account ac = new Account();
		ac.setAccountid(acid);
		ac.setName(name);

		acctMgr.addAccount(ac);
		return Response
				.status(200)
				.entity("addAccount is called, accountid : " + acid
						+ ", name : " + name).build();
	}

}
