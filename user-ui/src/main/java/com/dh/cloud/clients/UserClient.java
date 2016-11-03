package com.dh.cloud.clients;

import com.dh.cloud.models.User;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "user-provider-service")
public interface UserClient {
    @RequestMapping(method = RequestMethod.GET, value = "/users")
    List<User> users();

    @RequestMapping(method = RequestMethod.GET, value = "/findByName/{name}")
    User findByName(@PathVariable("name") String name);

}
