package com.xyu.order.service.impl;


import com.xyu.feign.clients.UserClient;
import com.xyu.feign.common.ResponseResult;
import com.xyu.feign.domain.User;
import com.xyu.order.domain.order;
import com.xyu.order.mapper.OrderMapper;
import com.xyu.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @Override
    public List allorder() {


        return orderMapper.allorder();
    }

    @Override
    public order oneorder(Integer orderid) {
        order oneorder = orderMapper.oneorder(orderid);

  /*      String url2="http://userserver/user/oneuser/"+oneorder.getUser_id();

        ResponseResult forObject = restTemplate.getForObject(url2, ResponseResult.class);

        LinkedHashMap data = (LinkedHashMap) forObject.getData();*/

        ResponseResult oneuser = userClient.oneuser(oneorder.getUser_id());

        //此处可以优化到工具类当中 ，解决方法
        LinkedHashMap data = (LinkedHashMap) oneuser.getData();
        oneorder.setUser(
                new User((Integer) data.get("id"),
                        (String) data.get("username"),
                        (String)data.get("address")));

        return oneorder;
    }
}
