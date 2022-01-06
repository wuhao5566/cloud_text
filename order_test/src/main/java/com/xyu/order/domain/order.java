package com.xyu.order.domain;

import com.xyu.feign.domain.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class order {
    private Integer id;
    private Integer user_id;
    private String name;
    private Integer price;
    private Integer num;
    private User user;
}
