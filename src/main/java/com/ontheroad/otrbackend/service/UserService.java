package com.ontheroad.otrbackend.service;

import com.ontheroad.otrbackend.model.User;

import java.util.List;

public interface UserService {

    List<User> getAll();

    String login(User user);

    String getPasswordByPhoneNumber(String phonenumber);
}
