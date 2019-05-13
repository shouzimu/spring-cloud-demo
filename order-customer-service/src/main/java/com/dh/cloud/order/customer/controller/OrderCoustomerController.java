package com.dh.cloud.order.customer.controller;

import com.dh.cloud.order.customer.intergration.OrderService;
import com.dh.cloud.order.customer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderCoustomerController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public Order one(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }

}
