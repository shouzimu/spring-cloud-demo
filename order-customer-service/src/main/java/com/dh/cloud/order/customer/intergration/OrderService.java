package com.dh.cloud.order.customer.intergration;


import com.dh.cloud.order.customer.model.Order;
import feign.codec.Encoder;
import feign.form.spring.SpringFormEncoder;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

@FeignClient(name = "order-provider", contextId = "order", path = "/order", configuration = OrderService.MultipartSupportConfig.class)
public interface OrderService {

    @GetMapping("/{id}")
    Order getOrder(@PathVariable("id") Long id);


    @GetMapping("/listByIds")
    List<Order> listByIds(@RequestParam("id") String ids);


    @GetMapping("/user/{userId}")
    List<Order> listByIds(@PathVariable("userId") Long userId);


    @PostMapping(value = "/uploadFile", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String uploadFile(@RequestPart("file") MultipartFile file);

    @Configuration
    class MultipartSupportConfig {

        @Bean
        public Encoder feignFormEncoder() {
            return new SpringFormEncoder();
        }
    }

}