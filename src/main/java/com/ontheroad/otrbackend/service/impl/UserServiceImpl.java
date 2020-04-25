package com.ontheroad.otrbackend.service.impl;

import com.ontheroad.otrbackend.dao.UserDao;
import com.ontheroad.otrbackend.model.User;
import com.ontheroad.otrbackend.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    public String login(User user) {
        String password = userDao.getPasswordByPhoneNumber(user.getPhonenumber());
        if(password.equals(user.getPassword())){
            return "ok";
        }
        return null;
    }

    @Override
    public String getPasswordByPhoneNumber(String phonenumber) {
        return userDao.getPasswordByPhoneNumber(phonenumber);
    }
}
