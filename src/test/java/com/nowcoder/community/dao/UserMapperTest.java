package com.nowcoder.community.dao;

import com.nowcoder.community.CommunityApplication;
import com.nowcoder.community.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

import javax.annotation.security.RunAs;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTest {

    @Autowired
    private UserMapper userMapper;
    @Test
    void selectById() {
        User user=userMapper.selectById(101);
        System.out.println(user);
    }

    @Test
    void selectByName() {
    }

    @Test
    void updatePassword() {
        User user=new User();
        user.setId(999);
        user.setPassword("12345");
        userMapper.insertUser(user);
        userMapper.updatePassword(999,"67890");
    }
}