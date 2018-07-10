package org.common.config;

import org.springframework.context.annotation.Bean;

import com.netflix.loadbalancer.IPing;
import com.netflix.loadbalancer.IRule;

public class RibbonLoadBalanceConfig {
	@Bean
	public IRule ribbonRule() {	// 返回一个负载均衡策略
		return new com.netflix.loadbalancer.RandomRule() ; // 随机访问策略
	}
	@Bean
	public IPing ribbonPing() {
		return new com.netflix.loadbalancer.PingUrl() ; // 配置ping策略
	}
}
