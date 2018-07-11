package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
@SpringBootApplication 
@EnableZuulProxy 
public class StartGatewayMain8501{
	public static void main(String[] args) {
		SpringApplication.run(StartGatewayMain8501.class, args) ;
	}
}
 