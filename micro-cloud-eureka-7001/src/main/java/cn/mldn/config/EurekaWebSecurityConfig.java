package cn.mldn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//@Configuration
//@EnableWebSecurity 
//public class EurekaWebSecurityConfig extends WebSecurityConfigurerAdapter {
//	 
//	@Override
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		auth.inMemoryAuthentication().withUser("edmin").password("{noop}mldnjava").roles("USER") ;
//	} 
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		// http.csrf().ignoringAntMatchers("/eureka/**");
//		// 使用HttpBasic模式进行安全访问配置，所有的路径都必须进行认证处理
//		http.httpBasic().and().authorizeRequests().anyRequest().fullyAuthenticated() ;
//	}
//}
