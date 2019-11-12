/**
 * 
 */
package org.angrygoat.gabblej.core.configuration;

import org.angrygoat.gabblej.core.configuration.GabbleConfiguration.NettyChannelType;
import org.angrygoat.gabblej.core.exception.GabbleConfigurationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.netty.bootstrap.Bootstrap;

/**
 * 
 * Configure details of the Netty {@link Bootstrap} using information in the {@link GabbleConfiguration}
 * @author conwaymc
 *
 */
public class BootstrapOptionSetter {
	
	private static final Logger logger = LoggerFactory.getLogger(BootstrapOptionSetter.class);

	
	public static void configureBootstrapGivenConfiguration(final GabbleConfiguration gabbleConfiguration, final Bootstrap bootstrap) throws GabbleConfigurationException {
		logger.info("configureBootstrapGivenConfiguration()");
		
		if (gabbleConfiguration ==  null) {
			throw new IllegalArgumentException("null gabbleConfiguration");
		}
		
		if (bootstrap == null) {
			throw new IllegalArgumentException("null bootstrap");
		}
		
		logger.info("gabbleConfiguration:{}", gabbleConfiguration);
		logger.info("bootstrap:{}", bootstrap);
		
		logger.debug("begin bouncing through relevant config properties");
		
		if (gabbleConfiguration.getNettyChannelType() == NettyChannelType.NIO_SOCKET) {
			
		} else {
			throw new GabbleConfigurationException("unhandled nettyChannelType");
		}
		
	}

}
