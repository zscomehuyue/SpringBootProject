package com.example.demo.dao;

import com.example.demo.pojo.User;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;


@CacheConfig(cacheNames = "users")
public interface UserDao {
    int deleteByPrimaryKey(String uid);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String uid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    String findIdByUserName(String userName);

    @Cacheable
    User findUserByUserName(String userName);
}