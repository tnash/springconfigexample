package com.clover.appconfig.configuration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(AppProperties.class)
public class AppPropertiesTest {
	@Autowired
	AppProperties appProperties;

	@Autowired
	Environment env;

	@Test
	void shouldLoadProperties() {
		assertTrue("Expected menus to not be null.", appProperties.getMenus() != null);
		assertTrue("Expected menus size to be greater than zero.", appProperties.getMenus().size() > 0);
	}
}

