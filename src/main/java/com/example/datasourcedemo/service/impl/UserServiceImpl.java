package com.example.datasourcedemo.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.example.datasourcedemo.dao.UserDao;
import com.example.datasourcedemo.entity.User;
import com.example.datasourcedemo.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-11-08 11:00:44
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;


    @Override
    @DS("slave_1")
    public List<User> query() {
        return userDao.selectList(null);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    @DS("master")
    public User insert(User user) {
        this.userDao.insert(user);
        return user;
    }
}
