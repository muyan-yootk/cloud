package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"cn.mldn.service"})  
public class StartBootConsumerMain{
	public static void main(String[] args) {
		SpringApplication.run(StartBootConsumerMain.class, args) ;
	}
}
