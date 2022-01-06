package com.xyu.order.controller;

import com.xyu.order.common.ResponseResult;
import com.xyu.order.domain.order;
import com.xyu.order.service.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/order")
@Slf4j
@CrossOrigin
public class orderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("allorder")
    @ResponseBody
    public ResponseResult<List> AllOrder(){
        List<order> allorder=orderService.allorder();
        return new ResponseResult<>(200,"ok",allorder);
    }

    @GetMapping("/oneorder/{orderid}")
    public ResponseResult oneorder(@PathVariable Integer orderid){

        return new ResponseResult(200,"ok",orderService.oneorder(orderid));
    }
}
