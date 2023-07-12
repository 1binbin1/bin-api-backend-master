package com.binbin.binapiadmin.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.binbin.binapicommon.mode.entity.User;
import org.springframework.stereotype.Service;

/**
 * @author hongxiaobin
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2023-07-12 16:52:34
 */
@Service
public interface UserService extends IService<User> {

}
