package org.example;  // 你的包名要和你的项目结构保持一致

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration  // 表示这是一个配置类
@ComponentScan(basePackages = "org.example")  // 扫描当前包及子包中的所有组件
public class AppConfig {
    // 这里不需要做其他设置，Spring 会自动扫描包中的类
}
