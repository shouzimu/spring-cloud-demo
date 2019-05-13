package com.dh.cloud.order.customer.model;

import java.sql.Timestamp;
import lombok.Data;

@Data
public class Order {
    private Long orderId;
    private Long userId;
    private String userName;
    private String status;
    private Integer price;
    private Timestamp createTime;
}
