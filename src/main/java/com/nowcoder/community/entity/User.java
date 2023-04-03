package com.nowcoder.community.entity;
import lombok.Data;

import java.util.Date;
/**
 * @Description: 用户类
 * @Author: cckong
 * @Date:
 */
@Data
public class User {

    private int id;
    private String username;
    private String password;
    private String salt;//加盐数据脱敏操作
    private String email;
    private int type;//0普通用户 1管理员 2版主
    private int status;//0未激活 1已激活
    private String activationCode;//激活码
    private String headerUrl;//头像的url路径
    private Date createTime;



}