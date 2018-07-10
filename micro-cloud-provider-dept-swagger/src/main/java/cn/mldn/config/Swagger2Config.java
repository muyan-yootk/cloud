package cn.mldn.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@Configuration
@EnableSwagger2 
public class Swagger2Config {
	@Bean
	public Docket getDocket() { 	// 此类主要是整个的Swagger配置项，利用这个类需要来指派扫描包
		return new Docket(DocumentationType.SWAGGER_2)
				.apiInfo(this.getApiInfo()).select()			// 读取描述信息
				.apis(RequestHandlerSelectors
				.basePackage("cn.mldn.rest")) 		// 扫描程序包
				.paths(PathSelectors.any()).build(); 			// 设置文档的显示类型
	}
	private ApiInfo getApiInfo() {							// 定义相关描述信息
		return new ApiInfoBuilder().title("部门业务微服务")
				.description("更多选择请关注www.mldn.cn")
				.termsOfServiceUrl("http://www.mldn.cn")
				.license("李兴华").version("1.0").build();
	}
}