package com.dh.cloud.web;

import com.dh.cloud.clients.UserClient;
import com.dh.cloud.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserClient userClient;

    @GetMapping("user/{name}")
    public User findByIdFeign(@PathVariable String name) {
        User user = this.userClient.findByName(name);
        return user;
    }

    @GetMapping("user")
    public List<User> user() {
       return this.userClient.users();
    }
}
