/**
 * 
 */
package org.angrygoat.gabblej.core;

import java.net.InetAddress;

/**
 * Specification for a connection to iRODS. This is a rough analogue to the prior Jargon {@code IRODSAccount}
 * 
 * @author conwaymc
 *
 */
public class IrodsConnectionSpec {

	
	/**
	 * Optional address for a local interface, if left {@code null} will ignore. This allows binding of the connection
	 * to a particular local address and interface.
	 */
	private InetAddress localIp = null;
	
	
	/**
	 * DNS address for the iRODS host machine
	 */
	private String irodsHost = "";
	
	/**
	 * Port for the iRODS control channel at the {@code irodsHost}, default is 1247
	 */
	private int irodsPort = 1247;
	
	public InetAddress getLocalIp() {
		return localIp;
	}

	public void setLocalIp(InetAddress localIp) {
		this.localIp = localIp;
	}

	public String getIrodsHost() {
		return irodsHost;
	}

	public void setIrodsHost(String irodsHost) {
		this.irodsHost = irodsHost;
	}

	public int getIrodsPort() {
		return irodsPort;
	}

	public void setIrodsPort(int irodsPort) {
		this.irodsPort = irodsPort;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("IrodsConnectionSpec [localIp=").append(localIp).append(", irodsHost=").append(irodsHost)
				.append(", irodsPort=").append(irodsPort).append("]");
		return builder.toString();
	}



}
