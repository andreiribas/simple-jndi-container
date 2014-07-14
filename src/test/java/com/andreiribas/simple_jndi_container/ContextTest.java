/**
 * 
 */
package com.andreiribas.simple_jndi_container;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.Name;
import javax.naming.NamingException;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

/**
 * @author Andrei Gonçalves Ribas <andrei.g.ribas@gmail.com>
 * 
 */
public class ContextTest {
	
	private static final String JAVA_NAMING_FACTORY_INITIAL_NAME_SYSTEM_PROPERTY = "java.naming.factory.initial";
	
	private static final String DEFAULT_OBJECT_JNDI_NAME = "object";
	
	private static final Object DEFAULT_OBJECT_JNDI_VALUE = new Object();

	private Context fixture;

	@Before
	public void setUp() throws NamingException {
		
		System.setProperty(JAVA_NAMING_FACTORY_INITIAL_NAME_SYSTEM_PROPERTY, SimpleJndiContextFactory.class.getName());
		
		fixture = new InitialContext();
	
	}
	
	@Test(expected = NullPointerException.class)
	public void testLookupWhenStringIsNullShouldThrowNullPointerException()
			throws NamingException {
		this.fixture.lookup((String) null);
	}

	@Test(expected = NamingException.class)
	public void testLookupWhenStringKeyDoesNotExistShouldThrowNamingException()
			throws NamingException {
		this.fixture.lookup(DEFAULT_OBJECT_JNDI_NAME);
	}

	@Test
	public void testLookupWhenStringKeyDoesAlreadyExistShouldThrowNamingException()
			throws NamingException {

		this.createObjectInContext(DEFAULT_OBJECT_JNDI_NAME,
				DEFAULT_OBJECT_JNDI_VALUE);

		TestCase.assertEquals(DEFAULT_OBJECT_JNDI_VALUE,
				fixture.lookup(DEFAULT_OBJECT_JNDI_NAME));

	}

	@Test(expected = NullPointerException.class)
	public void testLookupWhenNameIsNullShouldThrowNullPointerException()
			throws NamingException {

		Name name = null;

		this.fixture.lookup(name);

	}

	@Test(expected = NamingException.class)
	public void testLookupWhenNameKeyDoesNotExistShouldThrowNamingException()
			throws NamingException {

		Name name = SimpleName.fromString(DEFAULT_OBJECT_JNDI_NAME);

		this.fixture.lookup(name);

	}

	@Test
	public void testLookupWhenNameKeyDoesAlreadyExistShouldThrowNamingException()
			throws NamingException {

		Name name = SimpleName.fromString(DEFAULT_OBJECT_JNDI_NAME);

		this.createObjectInContext(name, DEFAULT_OBJECT_JNDI_VALUE);

		TestCase.assertEquals(DEFAULT_OBJECT_JNDI_VALUE,
				fixture.lookup(DEFAULT_OBJECT_JNDI_NAME));

	}

	public void createObjectInContext(String key, Object value)
			throws NamingException {
		this.fixture.bind(key, value);
	}

	public void createObjectInContext(Name name, Object value)
			throws NamingException {
		this.fixture.bind(name, value);
	}

}
