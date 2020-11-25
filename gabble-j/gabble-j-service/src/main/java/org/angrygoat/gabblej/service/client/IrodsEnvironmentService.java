/**
 * 
 */
package org.angrygoat.gabblej.service.client;

import org.angrygoat.gabblej.service.base.IrodsService;
import org.angrygoat.gabblej.service.client.domain.IrodsVersion;

/**
 * Interface for a service to access information about an iRODS server.
 * @author conwaymc
 *
 */
public class IrodsEnvironmentService implements IrodsService {
	
	/**
	 * Obtain the version (in raw string format) of the iRODS server at the connected host
	 * @return {@link IrodsVersion} with version information
	 */
	public IrodsVersion irodsVersion() { 
		return null;

	}

}
