package com.xyu.user.service;


import com.xyu.user.domain.User;

import java.util.List;

public interface UserService{

    List<User> allUservice();

    User oneuser(Integer userid);
}
