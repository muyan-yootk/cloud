package cn.mldn;
 
import org.common.config.RibbonLoadBalanceConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
@SpringBootApplication 
@RibbonClient(name="ribbonClient",configuration=RibbonLoadBalanceConfig.class) 
public class StartBootConsumerMain{
	public static void main(String[] args) {
		SpringApplication.run(StartBootConsumerMain.class, args) ;
	}
}
