# Swagger-demo
Swagger演示

> 引入相关依赖
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