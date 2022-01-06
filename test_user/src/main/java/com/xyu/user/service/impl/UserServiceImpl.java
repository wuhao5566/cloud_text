package com.xyu.user.service.impl;

import com.xyu.user.domain.User;
import com.xyu.user.mapper.UserMapper;
import com.xyu.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> allUservice() {
        return userMapper.alluser();
    }

    @Override
    public User oneuser(Integer userid) {

        System.out.println(userid);
        return userMapper.oneuser(userid);
    }
}
