package com.hemalata.app;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration{
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
	
	
http
.csrf().disable()
.authorizeRequests()
.antMatchers("/").permitAll()
.antMatchers("register").permitAll()
.antMatchers("login").permitAll()
.antMatchers("home").permitAll();

return http.build();
}
}
/*
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
/*
@Configuration
@EnableWebSecurity

 public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

@Override
protected void configure(HttpSecurity http) throws Exception {
http.authorizeRequests()
.antMatchers("/").permitAll()
.antMatchers("/Register").permitAll()
.antMatchers("/Login").permitAll()
.antMatchers("/home").permitAll();

}
} */
/*
@Configuration
@EnableWebSecurity
public class SecurityConfiguration{
@Bean
public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
http

.csrf().disable()
.authorizeHttpRequests()
.requestMatchers("/").permitAll()
.requestMatchers("register").permitAll()
.requestMatchers("login").permitAll()
.requestMatchers("home").permitAll();

return http.build();
}
}
*/

