package com.southwind.mmall002.service.impl;

import com.southwind.mmall002.entity.User;
import com.southwind.mmall002.mapper.UserMapper;
import com.southwind.mmall002.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 建强
 * @since 2020-05-18
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
