package com.dh.cloud.order.customer.controller;

import com.dh.cloud.order.customer.intergration.OrderService;
import com.dh.cloud.order.customer.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("order")
public class OrderCoustomerController {

    @Autowired
    private OrderService orderService;

    @GetMapping("/one/{id}")
    public Order one(@PathVariable("id") Long id) {
        return orderService.getOrder(id);
    }


    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart("file") MultipartFile file) {
        return orderService.uploadFile(file);
    }


}
