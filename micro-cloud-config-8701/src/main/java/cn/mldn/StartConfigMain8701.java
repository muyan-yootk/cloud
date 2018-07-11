package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@SpringBootApplication 
@EnableConfigServer
public class StartConfigMain8701{
	public static void main(String[] args) {
		SpringApplication.run(StartConfigMain8701.class, args) ;
	}
}
 