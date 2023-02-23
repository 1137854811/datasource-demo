package com.example.datasourcedemo.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.datasourcedemo.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-11-08 11:00:41
 */
@Mapper
public interface UserDao extends BaseMapper<User> {

}

