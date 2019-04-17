/*
 * package com.techies.security.springsecurityauthserver.config;
 * 
 * import org.springframework.context.annotation.Configuration; import
 * org.springframework.security.authentication.AuthenticationManager; import
 * org.springframework.security.config.annotation.authentication.configuration.
 * AuthenticationConfiguration; import
 * org.springframework.security.config.annotation.web.builders.HttpSecurity; import
 * org.springframework.security.config.annotation.web.configuration.
 * WebSecurityConfigurerAdapter; import
 * org.springframework.security.oauth2.config.annotation.web.configuration.
 * EnableResourceServer;
 * 
 * @EnableResourceServer
 * 
 * @Configuration public class ResourceServerConfig extends WebSecurityConfigurerAdapter {
 * 
 * AuthenticationManager authenticationManager;
 * 
 * public ResourceServerConfig(AuthenticationConfiguration authenticationConfiguration)
 * throws Exception { this.authenticationManager =
 * authenticationConfiguration.getAuthenticationManager(); }
 * 
 * @Override protected void configure(HttpSecurity http) throws Exception {
 * 
 * http.requestMatchers().antMatchers("/login",
 * "/oauth/authorize").and().authorizeRequests().anyRequest()
 * .authenticated().and().formLogin().permitAll(); }
 * 
 * }
 */