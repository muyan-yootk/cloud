package cn.mldn.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
@Configuration
public class DefaultAuthorizationServerConfigurerAdapter extends AuthorizationServerConfigurerAdapter {
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.inMemory().withClient("mldnclient").secret("{noop}clientpwd").autoApprove(true).authorizedGrantTypes("authorization_code")
				.scopes("webapp");
	}
}
