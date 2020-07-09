package com.zcy.service.impl;

import com.zcy.dubbo.entity.SysUser;
import com.zcy.dubbo.service.SysUserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.List;

@DubboService
@Service
public class UserServiceImpl implements SysUserService {
    @Override
    public SysUser get() {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(1);
        sysUser.setNickname("admin");
        sysUser.setUsername("admin");
        sysUser.setPassword("admin");
        return sysUser;
    }

    @Override
    public SysUser queryById(Integer userId) {
        SysUser sysUser = new SysUser();
        sysUser.setUserId(1);
        sysUser.setNickname("admin");
        sysUser.setUsername("admin");
        sysUser.setPassword("admin");
        return sysUser;
    }

    @Override
    public List<SysUser> queryAllByLimit(int offset, int limit) {
        return null;
    }

    @Override
    public SysUser insert(SysUser sysUser) {
        return null;
    }

    @Override
    public SysUser update(SysUser sysUser) {
        return null;
    }

    @Override
    public boolean deleteById(Integer userId) {
        return false;
    }
}
