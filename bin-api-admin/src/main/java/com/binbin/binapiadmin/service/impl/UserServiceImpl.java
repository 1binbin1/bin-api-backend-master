package com.binbin.binapiadmin.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.binbin.binapiadmin.mapper.UserMapper;
import com.binbin.binapiadmin.service.UserService;
import com.binbin.binapicommon.mode.entity.User;
import org.springframework.stereotype.Service;

/**
* @author hongxiaobin
* @description 针对表【user(用户)】的数据库操作Service实现
* @createDate 2023-07-12 17:02:53
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}



