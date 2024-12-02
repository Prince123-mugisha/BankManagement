package com.prince.AutheticationProjects.Controllers;

import com.prince.AutheticationProjects.Models.UserEntity;
import com.prince.AutheticationProjects.Service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class UserController {
    private final UserService userService;

    @PostMapping("/addUser")
    public UserEntity addUser(@RequestBody UserEntity user) {
        return userService.addUser(user);
    }

    @PostMapping("/login")
    public String verifyUser(@RequestBody UserEntity user) {
        return userService.verifyUser(user);
    }
}
