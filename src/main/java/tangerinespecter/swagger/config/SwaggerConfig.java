package tangerinespecter.swagger.config;

import com.github.xiaoymin.knife4j.spring.annotations.EnableSwaggerBootstrapUi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger配置类
 */
@Configuration
@EnableSwagger2//启用swagger
@EnableSwaggerBootstrapUi//启动新版ui
@Profile({"dev", "test"})//指定启用环境
public class SwaggerConfig {

    @Bean
    public Docket customDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.any())
                .build();
    }

    /**
     * 配置Api相关信息
     */
    private ApiInfo apiInfo() {
        Contact contact = new Contact("丢失的橘子", "https://github.com/TangerineSpecter", "993033472@qq.com");
        return new ApiInfoBuilder()
                .title("橘子测试文档")
                .description("swagger文档演示")
                .contact(contact)
                .version("1.0.0")
                .build();
    }
}
