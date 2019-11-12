/**
 * 
 */
package org.angrygoat.gabblej.core.exception;

/**
 * Exception caused by a general misconfiguration on the client side
 * @author conwaymc
 *
 */
public class GabbleConfigurationException extends GabbleCheckedException {

	public GabbleConfigurationException(String string) {
		super(string);
	}

	private static final long serialVersionUID = -2972085842405576216L;

}
