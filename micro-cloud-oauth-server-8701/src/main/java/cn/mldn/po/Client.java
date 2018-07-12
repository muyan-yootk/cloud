package cn.mldn.po;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

@SuppressWarnings("serial")
@Entity
public class Client implements Serializable {
	@Id
	private String clientid ;
	private String clientsecret ;
	private String scope ;
	private Integer locked ;
	private String authorizedgranttypes ;
	public String getClientid() {
		return clientid;
	}
	public void setClientid(String clientid) {
		this.clientid = clientid;
	}
	public String getClientsecret() {
		return clientsecret;
	}
	public void setClientsecret(String clientsecret) {
		this.clientsecret = clientsecret;
	}
	public String getScope() {
		return scope;
	}
	public void setScope(String scope) {
		this.scope = scope;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
	public String getAuthorizedgranttypes() {
		return authorizedgranttypes;
	}
	public void setAuthorizedgranttypes(String authorizedgranttypes) {
		this.authorizedgranttypes = authorizedgranttypes;
	}
	@Override
	public String toString() {
		return "Client [clientid=" + clientid + ", clientsecret=" + clientsecret + ", scope=" + scope + ", locked="
				+ locked + ", authorizedgranttypes=" + authorizedgranttypes + "]";
	}
	
	
}
