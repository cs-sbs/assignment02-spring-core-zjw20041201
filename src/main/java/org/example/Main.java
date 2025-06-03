package org.example; // 这个类属于org.example包

import org.example.UserController.UserController;
import org.example.service.UserService; // 导入UserService类
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ClassPathXmlApplicationContext; // 导入Spring容器类
import org.springframework.stereotype.Component;


@Configuration
@Component


public class Main {
    public static void main(String[] args) {
        // 使用 AppConfig 类来启动 Spring 容器
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // 获取并使用 Spring 管理的 Bean
        UserController userController = context.getBean(UserController.class);
        userController.addUserToSystem("john_doe");

        context.close();  // 关闭 Spring 容器
    }
}

