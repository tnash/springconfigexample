package com.clover.appconfig.configuration;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.springframework.test.util.AssertionErrors.assertTrue;

@ExtendWith(SpringExtension.class)
@EnableConfigurationProperties(com.clover.configuration.AppProperties.class)
@ActiveProfiles("test")
public class AppPropertiesTest {
    @Autowired
    com.clover.configuration.AppProperties appProperties;

    @Test
    void shouldLoadProperties() {
        assertTrue("Expected menus to not be null.", appProperties.getMenus() != null);
//        assertEquals("Home", appProperties.getMenus().get(0).getTitle());
    }
}
