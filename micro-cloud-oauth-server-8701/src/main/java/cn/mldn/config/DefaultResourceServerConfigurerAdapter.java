package cn.mldn.config;

import javax.servlet.http.HttpServletResponse;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
@Configuration
@EnableResourceServer	// 资源配置
public class DefaultResourceServerConfigurerAdapter extends ResourceServerConfigurerAdapter {
	@Override
	public void configure(HttpSecurity http) throws Exception {
		http.csrf().disable()
		.exceptionHandling()
		.authenticationEntryPoint((request,response,authException)->
			response.sendError(HttpServletResponse.SC_UNAUTHORIZED)) 
		.and()
			.authorizeRequests().anyRequest().authenticated()
		.and().httpBasic() ; 
	}
}
