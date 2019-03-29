package com.appprog.auth.service;

import com.appprog.auth.model.User;

public interface UserService {
    void save(User user);

    User findByUsername(String username);
}
