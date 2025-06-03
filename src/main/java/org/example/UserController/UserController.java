package org.example.UserController;

import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserController {
    @Autowired
    private UserService userService;
    public void addUserToSystem(String username){
        userService.addUser(username);
    }

}
