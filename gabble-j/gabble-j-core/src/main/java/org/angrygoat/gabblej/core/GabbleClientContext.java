package org.angrygoat.gabblej.core;

/**
 * Represents the root of a context, which is a connection to a specific endpoint (iRODS server) bound to a particular
 * local network interface
 * 
 * @author conwaymc
 *
 */
public class GabbleClientContext  {
	
	/**
	 * {@link IrodsConnectionSpec} that defines the connection parameters (host, account, etc)
	 */
	private final IrodsConnectionSpec irodsConnectionSpec;

	/**
	 * Create a context for a client
	 * @param irodsConnectionSpec {@link IrodsConnectionSpec}
	 */
	public GabbleClientContext(IrodsConnectionSpec irodsConnectionSpec) {
		super();
		this.irodsConnectionSpec = irodsConnectionSpec;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GabbleClientContext [irodsConnectionSpec=").append(irodsConnectionSpec).append("]");
		return builder.toString();
	}
	
	
	

}
