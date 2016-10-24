package com.dh.cloud.web;

import com.dh.cloud.domain.SysUser;
import com.dh.cloud.domain.SysUserMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.lang.invoke.MethodHandles;

@RestController
public class UserController {

    private final Logger logger = LoggerFactory.getLogger(MethodHandles.lookup().lookupClass());

    @Autowired
    private SysUserMapper sysUserMapper;

    @RequestMapping(value = "/findByName/{name}", method = RequestMethod.GET)
    public SysUser add(@PathVariable("name") String name) {
        try {
            SysUser u = sysUserMapper.findByName(name);
            return u;
        } catch (Exception e) {
            logger.error("ex=", e);
        }
        return null;
    }

}
