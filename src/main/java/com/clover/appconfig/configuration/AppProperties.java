package com.clover.appconfig.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "app", ignoreInvalidFields = false) // prefix app, find app.* values
@Data
public class AppProperties {

	private String frame;
	private String error;
	private List<Menu> menus = new ArrayList<>();
	private Compiler compiler = new Compiler();

	public void setFrame(String frame) {
		this.frame = frame;
	}

	@Data
	public static class Menu {
		private String name;
		private String path;
		private String title;

		@Override
		public String toString() {
			return "Menu{" +
					"name='" + name + '\'' +
					", path='" + path + '\'' +
					", title='" + title + '\'' +
					'}';
		}
	}

	@Data
	public static class Compiler {
		private String timeout;
		private String outputFolder;

		//getters and setters

		@Override
		public String toString() {
			return "Compiler{" +
					"timeout='" + timeout + '\'' +
					", outputFolder='" + outputFolder + '\'' +
					'}';
		}

	}
}
