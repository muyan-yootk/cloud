package cn.mldn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.StartOAuthServer8701;
import cn.mldn.dao.IMemberDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	// Spring需要启动容器才可以测试
@SpringBootTest(classes=StartOAuthServer8701.class)
public class TestMember {
	@Autowired 
	private IMemberDAO memberDAO ;
	private static final Logger LOG = LoggerFactory.getLogger(TestMember.class) ;
	@Test
	public void testSend() throws Exception {
		System.out.println(this.memberDAO.findOne("admin"));
	}
}
