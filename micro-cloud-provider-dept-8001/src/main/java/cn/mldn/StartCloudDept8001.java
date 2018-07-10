package cn.mldn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker 
public class StartCloudDept8001 {

	public static void main(String[] args) {
		SpringApplication.run(StartCloudDept8001.class, args);
	}

}
