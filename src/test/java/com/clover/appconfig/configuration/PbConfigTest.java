package com.clover.appconfig.configuration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(PbConfig.class)
public class PbConfigTest {
	@Autowired
	PbConfig pbConfig;

	@Test
	void shouldLoadConfig() {
		assertTrue("Expected name to be not null", pbConfig.getName() != null);
	}
}
