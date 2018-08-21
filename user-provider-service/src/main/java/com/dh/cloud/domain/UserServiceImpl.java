package com.dh.cloud.domain;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
    public User findByName(String name) {
        User u = new User();
        u.setName(name);
        u.setId(UUID.randomUUID().toString());
        u.setTel("134");
        return u;
    }

    public List<User> findAll() {
        return Arrays.asList(findByName("1"),findByName("2"));
    }
}
