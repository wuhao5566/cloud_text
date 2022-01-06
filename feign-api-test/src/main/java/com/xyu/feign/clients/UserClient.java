package com.xyu.feign.clients;


import com.xyu.feign.common.ResponseResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient("userserver")
public interface UserClient {

    @GetMapping("/user/oneuser/{userid}")
    public ResponseResult oneuser(@PathVariable("userid") Integer userid);
}
