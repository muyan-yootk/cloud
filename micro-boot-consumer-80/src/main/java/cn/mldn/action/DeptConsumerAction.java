package cn.mldn.action;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import cn.mldn.dto.DeptDTO;

@RestController
public class DeptConsumerAction {
	public static final String DEPT_ADD_URL = "http://dept-8001.com:8001/dept/add" ;
	public static final String DEPT_GET_URL = "http://dept-8001.com:8001/dept/get/" ;
	public static final String DEPT_LIST_URL = "http://dept-8001.com:8001/dept/list" ;
	@Autowired
	private RestTemplate restTemplate ;
	@GetMapping("/dept/list")
	public Object list() {
		return this.restTemplate.getForObject(DEPT_LIST_URL, List.class) ;
	}
	@GetMapping("/dept/get")
	public Object get(long deptno) {
		return this.restTemplate.getForObject(DEPT_GET_URL + deptno, DeptDTO.class) ;
	}
	@GetMapping("/dept/add")
	public Object add(DeptDTO dto) {
		return this.restTemplate.postForObject(DEPT_ADD_URL, dto, DeptDTO.class) ; 
	}
}
