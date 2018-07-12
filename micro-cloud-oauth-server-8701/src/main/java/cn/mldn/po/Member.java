package cn.mldn.po;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
@SuppressWarnings("serial")
@Entity
public class Member implements Serializable {
	@Id 
	private String mid ; 
	private String name ;
	private String password ;
	private Integer locked ;
	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getLocked() {
		return locked;
	}
	public void setLocked(Integer locked) {
		this.locked = locked;
	}
}
