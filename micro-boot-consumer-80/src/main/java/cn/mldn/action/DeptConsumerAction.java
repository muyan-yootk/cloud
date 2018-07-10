package cn.mldn.action;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.mldn.dto.DeptDTO;
import cn.mldn.service.IDeptService;

@RestController
public class DeptConsumerAction {
	@Autowired
	private IDeptService deptService ;
	@GetMapping("/dept/list")
	public Object list() {
		return this.deptService.list() ;
	}
	@GetMapping("/dept/get")
	public Object get(long deptno) {
		return this.deptService.get(deptno) ;
	}
	@GetMapping("/dept/add")
	public Object add(DeptDTO dto) {
		return this.deptService.add(dto) ;  
	}
}
