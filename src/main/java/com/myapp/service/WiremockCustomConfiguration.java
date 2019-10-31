package com.myapp.service;

import com.github.tomakehurst.wiremock.core.WireMockConfiguration;
import org.springframework.cloud.contract.stubrunner.HttpServerStubConfiguration;
import org.springframework.cloud.contract.stubrunner.provider.wiremock.WireMockHttpServerStubConfigurer;

public class WiremockCustomConfiguration extends WireMockHttpServerStubConfigurer {
	@Override
	public WireMockConfiguration configure(WireMockConfiguration httpStubConfiguration, HttpServerStubConfiguration httpServerStubConfiguration) {
		httpStubConfiguration.asynchronousResponseEnabled(true);
		httpStubConfiguration.asynchronousResponseThreads(20);
		httpStubConfiguration.containerThreads(100);
		httpStubConfiguration.jettyAcceptors(10);
		httpStubConfiguration.jettyAcceptQueueSize(100);
		httpStubConfiguration.jettyHeaderBufferSize(16384);
		httpStubConfiguration.disableRequestJournal();
		return httpStubConfiguration;
	}
}