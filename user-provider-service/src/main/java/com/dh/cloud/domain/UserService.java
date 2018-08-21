package com.dh.cloud.domain;

import java.util.List;

public interface UserService {
    User findByName(String name);

    List<User> findAll();
}
