package com.fengyuan.greens.service;

import com.fengyuan.greens.entity.User;
import com.fengyuan.greens.vo.ResultVo;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/25 18:34
 */
public interface UserService {
    ResultVo login(String phone,String password);

    ResultVo insertUser(User user);
}
