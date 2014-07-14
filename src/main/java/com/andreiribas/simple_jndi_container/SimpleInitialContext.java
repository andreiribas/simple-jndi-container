/**
 * 
 */
package com.andreiribas.simple_jndi_container;

import java.util.Hashtable;

import javax.naming.Binding;
import javax.naming.Context;
import javax.naming.Name;
import javax.naming.NameClassPair;
import javax.naming.NameParser;
import javax.naming.NamingEnumeration;
import javax.naming.NamingException;
/**
 * @author Andrei Gonçalves Ribas <andrei.g.ribas@gmail.com>
 *
 */

class SimpleInitialContext implements Context {
	
	private final Hashtable<String, Object> container = new Hashtable<String, Object>();

	public Object lookup(Name name) throws NamingException {
		return lookup(name.toString());
	}

	public Object lookup(String name) throws NamingException {
		
		Object result = container.get(name);

		if (result == null) {
			throw new NamingException(String.format("No object bound to name: %s.", name));
		}

		return result;
	
	}

	public void bind(Name name, Object obj) throws NamingException {
		bind(name.toString(), obj);
	}

	public void bind(String name, Object obj) throws NamingException {
		container.put(name, obj);
	}

	public Context createSubcontext(Name name) throws NamingException {
		return createSubcontext(name.toString());
	}

	public Context createSubcontext(String name) throws NamingException {
		Context cx = new SimpleSubContext();
		container.put(name.toString(), cx);
		return cx;
	}

	public void rebind(Name name, Object obj) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public void rebind(String name, Object obj) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public void unbind(Name name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public void unbind(String name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public void rename(Name oldName, Name newName) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public void rename(String oldName, String newName) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public NamingEnumeration<NameClassPair> list(Name name)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public NamingEnumeration<NameClassPair> list(String name)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public NamingEnumeration<Binding> listBindings(Name name)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public NamingEnumeration<Binding> listBindings(String name)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public void destroySubcontext(Name name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public void destroySubcontext(String name) throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public Object lookupLink(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object lookupLink(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public NameParser getNameParser(Name name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public NameParser getNameParser(String name) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Name composeName(Name name, Name prefix) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public String composeName(String name, String prefix)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object addToEnvironment(String propName, Object propVal)
			throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Object removeFromEnvironment(String propName) throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public Hashtable<?, ?> getEnvironment() throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() throws NamingException {
		// TODO Auto-generated method stub
		
	}

	public String getNameInNamespace() throws NamingException {
		// TODO Auto-generated method stub
		return null;
	}
}
