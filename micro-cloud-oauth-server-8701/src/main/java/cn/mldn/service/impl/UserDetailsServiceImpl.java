package cn.mldn.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import cn.mldn.dao.IMemberDAO;
import cn.mldn.po.Member;

public class UserDetailsServiceImpl implements UserDetailsService {
	@Autowired
	private IMemberDAO memberDAO ; 
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Member> optional = this.memberDAO.findById(username) ;
		if (!optional.isPresent()) {
			throw new UsernameNotFoundException("\"" + username + "\"没有发现，无法登录。");
		}
		Member member = optional.get() ;
		if (!member.getLocked().equals(0)) {
			throw new UsernameNotFoundException("\"" + username + "\"没有发现，无法登录。");
		}
		List<GrantedAuthority> all = new ArrayList<GrantedAuthority>() ;
		Set<String> set = this.memberDAO.findAllByMember(username) ;
		set.forEach((role)->{
			all.add(new SimpleGrantedAuthority(role)) ;
		});
		User user = new User(username, "{noop}" + member.getPassword(), all);
		return user ;
	}

}
