package com.andreiribas.simple_jndi_container;

import javax.naming.Context;
import javax.naming.NamingException;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Andrei Gonçalves Ribas <andrei.g.ribas@gmail.com>
 *
 */
public class SimpleJndiContextFactoryTest {
	
	private SimpleJndiContextFactory fixture;
	
	@Before
	public void setUp() {
		fixture = new SimpleJndiContextFactory();
	}
		
	@Test
	public void testGetInitialContextWhenEnvironmentHashtableIsNullShouldReturnSimpleInitialContext() throws NamingException {
		
		Context context = fixture.getInitialContext(null);
		
		TestCase.assertEquals(SimpleInitialContext.class, context.getClass());
	
	}
	
}

