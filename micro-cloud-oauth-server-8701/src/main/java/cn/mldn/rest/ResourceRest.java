package cn.mldn.rest;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ResourceRest {
	@RequestMapping("/user")
	public Principal resource(Principal user) {
		return user ;
	}
}
