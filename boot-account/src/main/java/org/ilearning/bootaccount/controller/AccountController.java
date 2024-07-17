package org.ilearning.bootaccount.controller;

import org.ilearning.bootaccount.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能注释
 *
 * @author 2024-07-17
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/list")
    public User userList() {
        User user = new User();
        user.setId(1);
        user.setUsername("user1");
        user.setAge(10);

        return user;
    }
}
