/**
 * 
 */
package com.andreiribas.simple_jndi_container;

import java.util.Hashtable;

import javax.naming.Context;
import javax.naming.NamingException;
import javax.naming.spi.InitialContextFactory;

/**
 * @author Andrei Gonçalves Ribas <andrei.g.ribas@gmail.com>
 *
 */
public class SimpleJndiContextFactory implements InitialContextFactory {

	public Context getInitialContext(Hashtable<?, ?> environment) throws NamingException {
		return new SimpleInitialContext();
	}

}
