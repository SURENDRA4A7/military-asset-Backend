package com.military.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfigu {

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	    http.csrf().disable().cors().and()
	        .authorizeHttpRequests(auth -> auth
	            .requestMatchers("/api/login").permitAll()  // Allow login 
	            .requestMatchers("/api/assets").authenticated() // Protect assets
	            .anyRequest().permitAll()
	        )
	        .httpBasic(); // This will use basic auth

	    return http.build();
	}


    @Bean
    public UserDetailsService userDetailsService() {
        return new InMemoryUserDetailsManager(
            User.withUsername("admin")
                .password("{noop}admin123") 
                .roles("USER")
                .build()
        );
    }
}
