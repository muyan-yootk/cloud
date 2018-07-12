package cn.mldn.service.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.oauth2.provider.ClientDetails;
import org.springframework.security.oauth2.provider.ClientDetailsService;
import org.springframework.security.oauth2.provider.ClientRegistrationException;
import org.springframework.security.oauth2.provider.client.BaseClientDetails;

import cn.mldn.dao.IClientDAO;
import cn.mldn.po.Client;

public class ClientDetailsServiceImpl implements ClientDetailsService {
	@Autowired
	private IClientDAO clientDAO ;
	@Override
	public ClientDetails loadClientByClientId(String clientId) throws ClientRegistrationException {
		// 1、根据clientid获取一个client的完整对象信息，如果该对象不为空则表示有此用户如果为控开关则表示无此用户
		Client client = this.clientDAO.findOne(clientId) ;
		// 2、判断当前是否有数据可以被查询出来，如果没有数据存在则表示该客户不存在，抛出异常
		if (client == null) {	// 数据不存在
			throw new ClientRegistrationException("\"" + clientId + "\"账户不存在，无法进行后续处理。");
		}
		// 3、从程序里面获取相应的客户信息
		if (!client.getLocked().equals(0)) {	// 4、账户被锁定了
			throw new ClientRegistrationException("\"" + clientId + "\"账户无法使用。");
		}
		// 5、密码的匹配处理不是由用户自己完成的，而是由SpringSecurity帮助用户处理的，此时只需要按照规则返回内容即可
		BaseClientDetails clientDetails = new BaseClientDetails() ;	// 创建客户端的详细信息保存
		clientDetails.setClientId(clientId); // 保存客户id
		clientDetails.setClientSecret(client.getClientsecret()); // 客户的原始密码
		clientDetails.setAuthorizedGrantTypes(Arrays.asList(client.getAuthorizedgranttypes()));
		clientDetails.setScope(Arrays.asList(client.getScope()));
		clientDetails.setAutoApproveScopes(Arrays.asList(client.getScope())); // 免确认
		Set<String> set = this.clientDAO.findAllByAuthoritiesByClient(clientId) ;// 查询对应的所有角色
		// 6、SpringSecurity所认可的授权一定要封装在GrantedAuthority类型之中
		List<GrantedAuthority> auth = new ArrayList<GrantedAuthority>() ;
		set.forEach((role)->{
			auth.add(new SimpleGrantedAuthority(role)) ;
		});
		clientDetails.setAuthorities(auth); // 保存授权
		return clientDetails ; 
	}

}
