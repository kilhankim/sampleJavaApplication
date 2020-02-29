package com.apress.spring;

import org.springframework.context.annotation.Bean;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
//import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;
import org.springframework.web.client.RestTemplate;
import org.apache.http.client.HttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;

@SpringBootApplication
//@EnableRedisHttpSession
public class SpringBootJournalApplication {


	public static void main(String[] args) {
		SpringApplication.run(SpringBootJournalApplication.class, args);
	}

    @Bean
    public RestTemplate restTemplate() {
    	RestTemplate restTemplate = new RestTemplate();
    	HttpComponentsClientHttpRequestFactory httpRequestFactory =  new HttpComponentsClientHttpRequestFactory();
		httpRequestFactory.setConnectTimeout(30000);
		httpRequestFactory.setReadTimeout(30000);
		HttpClient httpClient = HttpClientBuilder.create()
				.setMaxConnTotal(8)
				.setMaxConnPerRoute(4)
				.build();
		httpRequestFactory.setHttpClient(httpClient);
		restTemplate.setRequestFactory(httpRequestFactory);
        return restTemplate;
    }
}
