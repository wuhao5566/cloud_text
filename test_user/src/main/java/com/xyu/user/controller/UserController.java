package com.xyu.user.controller;

import com.xyu.user.common.ResponseResult;
import com.xyu.user.config.PatternProperties;
import com.xyu.user.domain.User;
import com.xyu.user.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@RestController
@RequestMapping("/user")
@Slf4j
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

   /* @Value("${pattern.dateformat}")
    private String date;*/

    @Autowired
    private PatternProperties patternProperties;

    @RequestMapping("/alluser")
    @ResponseBody
    public ResponseResult<List> allUser(){

        List<User> alluser =userService.allUservice();
        return new ResponseResult<List>(200,"iok",alluser);
    }

    @GetMapping("/oneuser/{userid}")
    public ResponseResult oneuser(@PathVariable Integer userid){
        return new ResponseResult(200,"ok",userService.oneuser(userid));
    }

    @GetMapping("/now")
    public String one2user(){

        return LocalDateTime.now().
                format(DateTimeFormatter.
                        ofPattern(patternProperties.getDateformat()));
    }
    @GetMapping("/commom")
    public String common(){

        return patternProperties.getWuhao();
    }
}
