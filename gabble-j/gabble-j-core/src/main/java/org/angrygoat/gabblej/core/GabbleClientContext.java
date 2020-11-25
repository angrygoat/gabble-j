package org.angrygoat.gabblej.core;


import org.angrygoat.gabblej.core.configuration.GabbleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Represents the root of a context, which is a connection to a specific endpoint (iRODS server) bound to a particular
 * local network interface
 * 
 * @author conwaymc
 *
 */
public class GabbleClientContext  {
	
	/**
	 * {@link GabbleConfiguration} that defines the baseline config for the entire Gabble client
	 */
	private final GabbleConfiguration gabbleConfiguration;
	private static final Logger logger = LoggerFactory.getLogger(GabbleClientContext.class);
	
	/**
	 * Constructor for a context taking immutable properties
	 * @param gabbleConfiguration {@link GabbleConfiguration}
	 */
	public GabbleClientContext(GabbleConfiguration gabbleConfiguration) {
		super();
		this.gabbleConfiguration = gabbleConfiguration;
	}

	
	
	public void init() {
	}

	

}
