package com.xyu.order.mapper;

import com.xyu.order.domain.order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface OrderMapper {

    List<order> allorder();

    order oneorder(Integer orderid);
}
