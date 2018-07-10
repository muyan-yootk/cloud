package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@SpringBootApplication 
@EnableEurekaServer 
public class StartEurekaMain7001{
	public static void main(String[] args) {
		SpringApplication.run(StartEurekaMain7001.class, args) ;
	}
}
