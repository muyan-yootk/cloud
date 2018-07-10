package cn.mldn;
 
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
@SpringBootApplication 
@EnableHystrixDashboard
public class StartDashboardMain8101{
	public static void main(String[] args) {
		SpringApplication.run(StartDashboardMain8101.class, args) ;
	}
}
 