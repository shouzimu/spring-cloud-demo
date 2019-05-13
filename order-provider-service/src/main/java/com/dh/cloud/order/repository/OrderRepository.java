package com.dh.cloud.order.repository;

import com.dh.cloud.order.model.Order;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OrderRepository {

    Long insert(Order entity);

    Order getByOrderId(long orderId);

    List<Order> selectByIds(@Param("ids") List<Long> ids);

    List<Order> selectByUserId(Long userId);
}
