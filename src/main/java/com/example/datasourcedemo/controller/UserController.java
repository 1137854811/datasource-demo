package com.example.datasourcedemo.controller;


import com.baomidou.mybatisplus.extension.conditions.query.QueryChainWrapper;
import com.example.datasourcedemo.entity.User;
import com.example.datasourcedemo.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2022-11-08 11:00:39
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;



    /**
     * 通过主键查询单条数据
     *
     * @return 单条数据
     */
    @GetMapping()
    public ResponseEntity<List<User>> query() {
        return ResponseEntity.ok(this.userService.query());
    }

    /**
     * 新增数据
     *
     * @param user 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<User> add(@RequestBody User user) {
        return ResponseEntity.ok(this.userService.insert(user));
    }

}

