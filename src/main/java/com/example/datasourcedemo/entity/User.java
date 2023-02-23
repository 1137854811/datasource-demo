package com.example.datasourcedemo.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2022-11-08 11:00:42
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = -72928128100049189L;
    
    private Long id;
    
    private String name;
    
    private Date createTime;



}

