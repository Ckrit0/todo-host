package com.ckrit.todo.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer{

	@Override
	public void addCorsMappings(CorsRegistry registry) {
		// 모든 URL패턴 접근 허용(CORS)
		registry.addMapping("/**").allowedOrigins("http://localhost:8080").allowedMethods(HttpMethod.POST.name());
	}
	
}
