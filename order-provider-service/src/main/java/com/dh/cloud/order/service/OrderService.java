package com.dh.cloud.order.service;

import com.dh.cloud.order.model.Order;
import com.dh.cloud.order.repository.OrderRepository;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @Autowired
    private OrderRepository orderRepository;


    public Long insert(Order entity) {
        return orderRepository.insert(entity);
    }

    public Order getByOrderId(long orderId) {
        return orderRepository.getByOrderId(orderId);
    }

    public List<Order> listByIds(List<Long> ids) {
        return orderRepository.selectByIds(ids);
    }


    public List<Order> listByUserId(Long userId) {
        return orderRepository.selectByUserId(userId);
    }
}
