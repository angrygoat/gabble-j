/**
 * 
 */
package org.angrygoat.gabblej.core.configuration;

/**
 * Base configuration for the overall Gabble client
 * @author conwaymc
 *
 */
public class GabbleConfiguration {

	/**
	 * Type of channel to be created
	 * @author conwaymc
	 *
	 */
	public enum NettyChannelType {NIO_SOCKET};
	
	private NettyChannelType nettyChannelType = NettyChannelType.NIO_SOCKET;

	public NettyChannelType getNettyChannelType() {
		return nettyChannelType;
	}

	public void setNettyChannelType(NettyChannelType nettyChannelType) {
		this.nettyChannelType = nettyChannelType;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GabbleConfiguration [nettyChannelType=").append(nettyChannelType).append("]");
		return builder.toString();
	}
	
	
	
}
