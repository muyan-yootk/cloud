package cn.mldn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

import cn.mldn.service.impl.UserDetailsServiceImpl;
@Configuration
public class DefaultWebSecurityConfig extends WebSecurityConfigurerAdapter {
	@Bean
	public UserDetailsService getUserDetailsService() {
		return new UserDetailsServiceImpl() ;
	}

	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(this.getUserDetailsService()) ;
	} 
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated() ;
	}
}
