package cn.mldn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import cn.mldn.StartOAuthServer8701;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration	// Spring需要启动容器才可以测试
@SpringBootTest(classes=StartOAuthServer8701.class)
public class TestRedis {
	@Autowired 
	private RedisConnectionFactory redisConnectionFactory ;
	private static final Logger LOG = LoggerFactory.getLogger(TestRedis.class) ;
	@Test
	public void testSend() throws Exception {
		System.out.println(this.redisConnectionFactory.getConnection());
	}
}
