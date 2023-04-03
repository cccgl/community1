package com.nowcoder.community.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class DiscussPostMapperTest {
    @Autowired
    private DiscussPostMapper discussPostMapper;

    @Test
    void selectDiscussPostRows() {
        if(discussPostMapper==null) System.out.println("null");
        //System.out.println(discussPostMapper.selectDiscussPostById(110));
        int rows = discussPostMapper.selectDiscussPostRows(101);
        System.out.println(discussPostMapper.selectAllDiscussPosts( 0, 10));
        System.out.println(rows);
    }


}