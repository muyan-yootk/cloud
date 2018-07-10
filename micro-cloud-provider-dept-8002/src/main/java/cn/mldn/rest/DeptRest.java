package cn.mldn.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.dto.DeptDTO;
import cn.mldn.service.IDeptService;

@RestController
public class DeptRest {
	@Autowired
	private IDeptService deptService ;
	@PostMapping("/dept/add")
	public Object add(@RequestBody DeptDTO dto) { 
		return this.deptService.add(dto) ;
	}
	@GetMapping("/dept/get/{deptno}")
	public Object get(@PathVariable("deptno") long deptno) {
		return this.deptService.get(deptno) ;
	}
	@GetMapping("/dept/list")  
	public Object list() {
		return this.deptService.list() ;
	}
}
