//package com.sales.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//
//@EnableWebSecurity
//public class SecurityConfig extends WebSecurityConfigurerAdapter{ 
// @Override
// protected void configure(HttpSecurity http) throws Exception {
//  http
//    .authorizeRequests()
//    .antMatchers("/url1.html", "/url2.html", "url4.html")
//    .authenticated()
//    .and()
//    .formLogin();
//  }
//
//  @Bean
//  @Override
//  public UserDetailsService userDetailsService() {
//    UserDetails user = User.withDefaultPasswordEncoder()
//			.username("user")
//			.password("password")
//			.roles("USER")
//			.build();
//    return new InMemoryUserDetailsManager(user);
//  }
//}
