package com.xyu.user.mapper;

import com.xyu.user.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    List<User> alluser();

    User oneuser(Integer userid);
}
