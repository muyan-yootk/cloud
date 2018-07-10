package cn.mldn.service;

import java.util.List;

import org.commons.config.FeignClientConfig;
import org.commons.service.fallback.DeptServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import cn.mldn.dto.DeptDTO;
 
@FeignClient(value = "MICRO-CLOUD-DEPT-SERVICE", 
	configuration = FeignClientConfig.class,
	fallback=DeptServiceFallback.class) // 定义现在要调用的微服务名称 
public interface IDeptService {
	@PostMapping("/dept/add")
	public DeptDTO add(DeptDTO dto) ;
	@GetMapping("/dept/get/{dno}")
	public DeptDTO get(@PathVariable("dno") long deptno) ;
	@GetMapping("/dept/list")
	public List<DeptDTO> list() ; 
}
