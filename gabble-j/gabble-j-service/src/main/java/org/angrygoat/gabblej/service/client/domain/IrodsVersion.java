/**
 * 
 */
package org.angrygoat.gabblej.service.client.domain;

/**
 * Base information on the version of iRODS server
 * @author conwaymc
 *
 */
public class IrodsVersion {
	
	/**
	 * Raw string-ified iRODS version number, N.B. there are other methods to get details (major/minor, etc)
	 */
	private String versionString = "";

	public String getVersionString() {
		return versionString;
	}

	public void setVersionString(String versionString) {
		this.versionString = versionString;
	}

}
