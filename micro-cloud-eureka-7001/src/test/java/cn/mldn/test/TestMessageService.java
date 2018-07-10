package cn.mldn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.StartEurekaMain7001;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	// Spring需要启动容器才可以测试
@SpringBootTest(classes=StartEurekaMain7001.class)
public class TestMessageService {
	private static final Logger LOG = LoggerFactory.getLogger(TestMessageService.class) ;
	@Test
	public void testSend() throws Exception {
	}
}
