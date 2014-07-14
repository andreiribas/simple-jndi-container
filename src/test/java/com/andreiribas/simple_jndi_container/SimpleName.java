/**
 * 
 */
package com.andreiribas.simple_jndi_container;

import java.util.Enumeration;

import javax.naming.InvalidNameException;
import javax.naming.Name;

/**
 * @author Andrei Gonçalves Ribas <andrei.g.ribas@gmail.com>
 *
 */
public class SimpleName implements Name {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8118447589272274501L;
	
	private final String stringName;
	
	public SimpleName(String stringName) {
		this.stringName = stringName;
	}
	
	public int compareTo(Object obj) {
		throw new NotImplementedOperationException();
	}

	public int size() {
		return 0;
	}

	public boolean isEmpty() {
		throw new NotImplementedOperationException();
	}

	public Enumeration<String> getAll() {
		throw new NotImplementedOperationException();
	}

	public String get(int posn) {
		throw new NotImplementedOperationException();
	}

	public Name getPrefix(int posn) {
		throw new NotImplementedOperationException();
	}

	public Name getSuffix(int posn) {
		throw new NotImplementedOperationException();
	}

	public boolean startsWith(Name n) {
		throw new NotImplementedOperationException();
	}

	public boolean endsWith(Name n) {
		throw new NotImplementedOperationException();
	}

	public Name addAll(Name suffix) throws InvalidNameException {
		throw new NotImplementedOperationException();
	}

	public Name addAll(int posn, Name n) throws InvalidNameException {
		throw new NotImplementedOperationException();
	}

	public Name add(String comp) throws InvalidNameException {
		throw new NotImplementedOperationException();
	}

	public Name add(int posn, String comp) throws InvalidNameException {
		throw new NotImplementedOperationException();
	}

	public Object remove(int posn) throws InvalidNameException {
		throw new NotImplementedOperationException();
	}
	
	@Override
	public String toString() {
		return this.stringName;
	}
	
	@Override
	public Object clone() {
		return null;
	}
	
	public static Name fromString(String name) {
		return new SimpleName(name);
	}

}
