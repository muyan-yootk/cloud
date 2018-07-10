package cn.mldn;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.dao.IDeptDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration // Spring需要启动容器才可以测试
@SpringBootTest(classes = StartCloudDept8002.class)
public class TestDeptDAO {
	@Autowired
	private IDeptDAO deptDAO ;
	@Test
	public void test() {
		System.out.println(this.deptDAO.findById(6L));
	}
}
