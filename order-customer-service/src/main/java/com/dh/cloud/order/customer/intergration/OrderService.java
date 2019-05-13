package com.dh.cloud.order.customer.intergration;


import com.dh.cloud.order.customer.model.Order;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "order-provider", contextId = "order", path = "/order")
public interface OrderService {

    @GetMapping("/{id}")
    Order getOrder(@PathVariable("id") Long id);


    @GetMapping("/listByIds")
    List<Order> listByIds(@RequestParam("id") String ids);


    @GetMapping("/user/{userId}")
    List<Order> listByIds(@PathVariable("userId") Long userId);
}