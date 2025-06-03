package org.example.service;  // 这个类属于org.example.service包（类似文件夹）

import org.springframework.stereotype.Service; // 导入Spring的@Service注解

@Service // 告诉Spring：这个类是一个“服务”，需要被Spring管理（类似贴上“重要组件”标签）
public class UserService {  // 定义一个公开的类，类名是UserService

    // 添加用户的方法（参数是用户名）
    public void addUser(String username) {
        // 模拟添加用户操作（实际开发中这里会连接数据库）
        System.out.println("添加用户: " + username); // 打印信息到控制台
    }
}