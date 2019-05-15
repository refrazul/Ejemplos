package com.palina.cross.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


/**
 * Configura Cross de manera global
 * @author refrazul@gamil.com 
 *
 */
@Configuration
public class WebConfiguration {

	@Bean
	public WebMvcConfigurer crossConfig() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*");
			}
		};
	}
	
}
