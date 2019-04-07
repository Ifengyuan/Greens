package com.fengyuan.greens.service.impl;

import com.fengyuan.greens.dao.UserMapper;
import com.fengyuan.greens.entity.User;
import com.fengyuan.greens.service.UserService;
import com.fengyuan.greens.token.TokenUtil;
import com.fengyuan.greens.util.ResultUtil;
import com.fengyuan.greens.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/25 18:36
 */
@Service
public class UserServiceImpl implements UserService {
    private ResultVo rv;
    @Autowired
    private UserMapper userMapper;
    @Override
    public ResultVo login(String phone, String password) {

        User user = userMapper.selectByPhone(phone);
        if (user != null){
            if (user.getPassword().equals(password)){
                String token = TokenUtil.createToken(user);
                return ResultUtil.exec(true,"Ok",token);
            }
        }
        return ResultUtil.exec(false,"用户名或密码不正确",null);
    }


    @Override
    public ResultVo insertUser(User user) {
        try {
            userMapper.insert(user);
            rv = ResultVo.setOK(null);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return rv;
    }
}
