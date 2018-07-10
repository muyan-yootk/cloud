package cn.mldn.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

import cn.mldn.dto.DeptDTO;
import cn.mldn.service.IDeptService;

@RestController
public class DeptRest {
	@Autowired
	private IDeptService deptService ;
	@HystrixCommand
	@PostMapping("/dept/add")
	public Object add(@RequestBody DeptDTO dto) { 
		return this.deptService.add(dto) ;
	}
	@HystrixCommand
	@GetMapping("/dept/get/{deptno}")
	public Object get(@PathVariable("deptno") long deptno) {
		if (deptno == 1) {
			throw new RuntimeException("不允许查询1号内容。") ;
		}
		return this.deptService.get(deptno) ;
	}
	@HystrixCommand
	@GetMapping("/dept/list")  
	public Object list() {
		return this.deptService.list() ;
	}
} 
