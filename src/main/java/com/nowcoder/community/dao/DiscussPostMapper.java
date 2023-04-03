package com.nowcoder.community.dao;

import com.nowcoder.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface DiscussPostMapper {


    List<DiscussPost> selectAllDiscussPosts(int offset, int limit);
    /**
     * 我的帖子这个功能可以使用，看别人的时候也是这个功能，这个默认是userID = 0, 动态sql
     * 分页要考虑，支持分页需要， limit关键字。
     * 在mapper中 返回值写DiscussPost就可以 list会自动识别
     * @param userId
     * @param offset
     * @param limit
     * @return
     */

    List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

    /**
     * 如果需要动态（<if></if>）拼一个条件，并且只有这一个参数，那么必须要写别名。
     * @param userId
     * @return
     */
    int selectDiscussPostRows(@Param("userId") int userId);

    /**
     * 插入帖子，discussPost对象
     * @param discussPost
     * @return
     */
    int insertDiscussPost(DiscussPost discussPost);

    /**
     * 根据主键查询帖子详情
     * @param id
     * @return
     */
    DiscussPost selectDiscussPostById(int id);

    /**
     * p23 更新帖子评论数量的方法
     */
    int updateCommentCount(int id, int commentCount);



}
