package com.zcy.controller;

import com.zcy.dubbo.entity.SysUser;
import com.zcy.dubbo.service.SysUserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/user")
@RestController
public class UserController {
    @DubboReference
    private SysUserService userService;

    @GetMapping
    public SysUser get() {
        return userService.queryById(1);
    }

}
