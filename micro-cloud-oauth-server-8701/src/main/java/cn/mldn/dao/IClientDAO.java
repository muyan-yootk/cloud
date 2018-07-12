package cn.mldn.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import cn.mldn.po.Client;

public interface IClientDAO extends JpaRepository<Client, String> {
	@Query(nativeQuery=true,value="SELECT authoid FROM client_authorities WHERE clientid=:clientid")
	public Set<String> findAllByAuthoritiesByClient(@Param("clientid") String clienid) ;
}
