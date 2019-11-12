/**
 * 
 */
package org.angrygoat.gabblej.core.exception;

/**
 * @author conwaymc
 *
 */
public class GabbleRuntimeException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1040700160599371531L;

	/**
	 * 
	 */
	public GabbleRuntimeException() {
	}

	/**
	 * @param message {@code String} with an exception message
	 */
	public GabbleRuntimeException(String message) {
		super(message);
	}

	/**
	 * @param cause {@link Throwable} that is the chained cause 
	 */
	public GabbleRuntimeException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message {@code String} with an exception message
	 * @param cause {@link Throwable} that is the chained cause 
	 */
	public GabbleRuntimeException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param message {@code String} with an exception message
	 * @param cause {@link Throwable} that is the chained cause 
	 * @param enableSuppression {@code boolean} to enable suppression
	 * @param writableStackTrace {@code boolean} if a writeable stacktrace
	 */
	public GabbleRuntimeException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
