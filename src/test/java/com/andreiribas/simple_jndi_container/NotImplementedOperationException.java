/**
 * 
 */
package com.andreiribas.simple_jndi_container;

/**
 * @author Andrei Gonçalves Ribas <andrei.g.ribas@gmail.com>
 *
 */
public class NotImplementedOperationException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6079252195918583618L;

	public NotImplementedOperationException() {
		super("The operation was not implemented.");
	}
	
	public NotImplementedOperationException(Exception e) {
		super("The operation was not implemented.", e);
	}

}
