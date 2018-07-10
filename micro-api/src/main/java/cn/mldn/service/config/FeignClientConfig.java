package cn.mldn.service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {
	@Bean 
	public feign.Logger.Level getFeignLoggerLevel() {
		return feign.Logger.Level.FULL ;
	}
}
