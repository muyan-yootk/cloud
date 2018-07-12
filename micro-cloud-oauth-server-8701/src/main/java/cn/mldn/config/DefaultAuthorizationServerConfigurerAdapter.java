package cn.mldn.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerEndpointsConfigurer;
import org.springframework.security.oauth2.provider.token.store.redis.RedisTokenStore;

import cn.mldn.service.impl.ClientDetailsServiceImpl;
@Configuration
public class DefaultAuthorizationServerConfigurerAdapter extends AuthorizationServerConfigurerAdapter {
	@Autowired
	private RedisConnectionFactory redisConnectionFactory ;
	
	@Override
	public void configure(AuthorizationServerEndpointsConfigurer endpoints) throws Exception {
		endpoints.tokenStore(new RedisTokenStore(this.redisConnectionFactory)) ;
	} 
	
	@Override
	public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
		clients.withClientDetails(new ClientDetailsServiceImpl()) ;
	}
}
