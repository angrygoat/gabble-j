package org.angrygoat.gabblej.core;


import org.angrygoat.gabblej.core.configuration.GabbleConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;

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
	 * {@link EventLoopGroup} that handles event loops for conn
	 */
	private EventLoopGroup eventLoopGroup = new NioEventLoopGroup();
	private final Bootstrap bootstrap;

	
	public GabbleClientContext(GabbleConfiguration gabbleConfiguration ) {
		this.gabbleConfiguration = gabbleConfiguration;
		this.bootstrap = new Bootstrap();
		bootstrap.group(eventLoopGroup);
	}
	
	public ChannelFuture startClient(final IrodsConnectionSpec irodsConnectionSpec) {
		logger.info("startClient()");
		if (irodsConnectionSpec == null) {
			throw new IllegalArgumentException("null irodsConnectionSpec"); 
		}
		
		
		
		
		return null;
	}

	
	
	public void init() {
		eventLoopGroup = new NioEventLoopGroup();
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("GabbleClientContext [gabbleConfiguration=").append(gabbleConfiguration)
				.append(", eventLoopGroup=").append(eventLoopGroup).append(", bootstrap=").append(bootstrap)
				.append("]");
		return builder.toString();
	}
	
	
	

}
