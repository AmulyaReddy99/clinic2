package com.example.demo.security;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.services.MyUserDetailsService;


@EnableWebSecurity
public class ClinicSecurity extends WebSecurityConfigurerAdapter {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	private MyUserDetailsService myUserDetailsService;
	
	@Override
	@Bean
	public AuthenticationManager authenticationManagerBean() throws Exception {
	    return super.authenticationManagerBean();
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(myUserDetailsService);
	}
	
	/*
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication()
			.dataSource(dataSource)
			.usersByUsernameQuery("select username,password,enabled from users where username=?")
			.authoritiesByUsernameQuery("select username,authority from authorities where username=?");
//			.withDefaultSchema();
//			.withUser(
//					User.withUsername("user")
//						.password("password")
//						.roles("USER")
//			)
//			.withUser(
//					User.withUsername("admin")
//						.password("password")
//						.roles("ADMIN")
//			);
	}*/
	
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication()
//			.withUser("user")
//			.password("password")
//			.roles("USER")
//			.and()
//			.withUser("admin")
//			.password("password")
//			.roles("ADMIN")
//			.and();
//		
//	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//			.antMatchers("/admin","static/css","static/js").permitAll()
//			.antMatchers("/user").hasAnyRole("USER","ADMIN")
//			.antMatchers("/").hasAnyRole()
//			.and().formLogin();
//	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
			.authorizeRequests().antMatchers("/authenticate").permitAll()
			.anyRequest().authenticated();
	}
	
	@Bean
	public PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
}
