# Swagger-demo
Swagger演示

#### SpringBoot集成Swagger

> 引入Swagger相关依赖
```xml
<!-- swagger组件 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger2</artifactId>
    <version>2.9.2</version>
</dependency>
<!-- swagger-ui界面组件 -->
<dependency>
    <groupId>io.springfox</groupId>
    <artifactId>springfox-swagger-ui</artifactId>
    <version>2.9.2</version>
</dependency>
```

#### SwaggerConfig类

- 配置Swagger相关信息
- 如果配置了启用环境，需要在配置文件配置相关环境信息，否则无法访问

> 访问swagger-ui界面地址：http://localhost:8081/swagger-ui.html

#### SpringBoot集成knife4j

 knife4j是 Swagger 生成 API 文档的增强解决方案
 
 > 引入knife4j相关依赖

```xml
<dependency>
    <groupId>com.github.xiaoymin</groupId>
    <artifactId>knife4j-spring-boot-starter</artifactId>
    <version>1.9.6</version>
</dependency>
```
#### SwaggerConfig类启用knife4j

```java
@EnableSwaggerBootstrapUi
```

> 访问knife4j地址：http://localhost:8081/doc.html
