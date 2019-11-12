package org.angrygoat.gabblej.core.exception;

public class GabbleCheckedException extends Exception {

	
	private static final long serialVersionUID = 5446702618013160909L;

	/**
	 * Base checked exception for Gabble, including checked iRDOS exception
	 */
	public GabbleCheckedException() {
	}

	public GabbleCheckedException(String message) {
		super(message);
	}

	public GabbleCheckedException(Throwable cause) {
		super(cause);
	}

	public GabbleCheckedException(String message, Throwable cause) {
		super(message, cause);
	}

	public GabbleCheckedException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
