package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
@SpringBootApplication 
@EnableAuthorizationServer 
@ComponentScan(basePackages="cn.mldn")
public class StartOAuthServer8701{
	public static void main(String[] args) {  
		SpringApplication.run(StartOAuthServer8701.class, args) ;
	} 
}
 