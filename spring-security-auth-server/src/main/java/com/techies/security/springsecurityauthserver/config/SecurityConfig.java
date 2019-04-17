package com.techies.security.springsecurityauthserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

@Configuration
@EnableWebSecurity
/*
 * @Order(1000)
 * 
 * @EnableGlobalMethodSecurity(prePostEnabled = true)
 */
public class SecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
		return super.authenticationManagerBean();
	}

	@Override
	@Bean
	public UserDetailsService userDetailsServiceBean() throws Exception {
		return super.userDetailsServiceBean();
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests().antMatchers("/").permitAll().antMatchers("/service/getText").hasRole("USER")
		        .anyRequest().authenticated().and().formLogin().permitAll().and().logout().permitAll();
		http.csrf().disable();
	}

	@Override
	public void configure(WebSecurity web) throws Exception {
		// TODO Auto-generated method stub
		web.ignoring().antMatchers("/resources/**");
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication().withUser("user1").password("{noop}user123").roles("USER").and().withUser("user2")
		        .password("{noop}password2").roles("USER", "ADMIN");
	}
	/*
	 * @Autowired private UserDetailsService userDetailsService;
	 * 
	 * @Override
	 * 
	 * @Bean public AuthenticationManager authenticationManagerBean() throws Exception {
	 * return super.authenticationManagerBean(); }
	 * 
	 * @Autowired public void globalUserDetails(AuthenticationManagerBuilder auth) throws
	 * Exception { auth.userDetailsService(userDetailsService); }
	 */
}