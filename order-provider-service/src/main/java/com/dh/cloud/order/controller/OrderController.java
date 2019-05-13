package com.dh.cloud.order.controller;

import com.dh.cloud.order.model.Order;
import com.dh.cloud.order.service.OrderService;
import com.netflix.discovery.converters.Auto;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
@Slf4j
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/{id}")
    public Order getOrder(@PathVariable("id") Long id) {
        Order order = orderService.getByOrderId(id);
        log.info("Get Order: {}", order);
        return order;
    }


    @GetMapping("/listByIds")
    public List<Order> listByIds(@RequestParam("id") String ids) {
        List<Long> queryIds = Arrays.asList(ids.split(",")).stream().map(t -> Long.parseLong(t))
                .collect(Collectors.toList());
        List<Order> orders = orderService.listByIds(queryIds);
        log.info("listByIds Order: {}", orders.size());
        return orders;
    }


    @GetMapping("/user/{userId}")
    public List<Order> listByIds(@PathVariable("userId") Long userId) {
        List<Order> orders = orderService.listByUserId(userId);
        log.info("listByIds Order: {}", orders.size());
        return orders;
    }

}
