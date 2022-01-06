package com.xyu.order.service;

import com.xyu.order.domain.order;

import java.util.List;

public interface OrderService {


    List<order> allorder();

    order oneorder(Integer orderid);
}
