package com.gossip.serviceInterf;

import java.util.List;

import com.gossip.entity.User;

public interface UserServiceInterface {
    User saveUser(User user);
    List<User> getAllUsers();
    User getUserById(Long userId);
}

