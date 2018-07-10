package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
@SpringBootApplication
@EnableFeignClients(basePackages= {"cn.mldn.service"})  
public class StartBootConsumerMain{
	public static void main(String[] args) {
		SpringApplication.run(StartBootConsumerMain.class, args) ;
	}
}
