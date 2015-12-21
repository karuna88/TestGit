package com.karuna.ldap.client;

import javax.naming.NamingException;

public class Main {

	/**
	 * @param args
	 */
	//Git Test
	public static void main(String[] args) {
		try {
			new LDAPClient().ldapTestConn();
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
