package com.apress.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.context.annotation.Bean;

//import org.springframework.data.redis.connection.RedisConnectionFactory;
//import org.springframework.security.oauth2.provider.token.TokenStore;
//import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;


@Configuration
@EnableAuthorizationServer
//@EnableResourceServer
public class ResourceOAuthSecurityConfiguration extends ResourceServerConfigurerAdapter{

	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		   .anyRequest().authenticated();
	}

 //       @Bean
  //      public TokenStore RedisTokenStore(RedisConnectionFactory redisConnectionFactory) {
   //         return new RedisTokenStore(redisConnectionFactory);
//        }
	

}
