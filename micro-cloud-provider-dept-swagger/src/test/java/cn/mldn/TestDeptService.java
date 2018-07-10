package cn.mldn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.dto.DeptDTO;
import cn.mldn.service.IDeptService;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration // Spring需要启动容器才可以测试
@SpringBootTest(classes = StartCloudDept8001.class)
public class TestDeptService {
	@Autowired
	private IDeptService deptService ;
	@Test
	public void testList() {
		System.out.println(this.deptService.list());
	}
	@Test 
	public void testGet() {
		System.out.println(this.deptService.get(6));
	}
	@Test
	public void testAdd() {
		DeptDTO dto = new DeptDTO() ;
		dto.setDname("教学部");
		dto.setLoc("北京-天安门");
		System.out.println(this.deptService.add(dto));
	}
}
