package com.fengyuan.greens.controller;

import com.fengyuan.greens.entity.User;
import com.fengyuan.greens.service.UserService;
import com.fengyuan.greens.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/25 19:27
 */
@Api(value = "登录Controller",tags = "登录模块接口")
@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService us;
    @ApiOperation("登录")
    @PostMapping("login.do")
    public ResultVo login(@ApiParam(value = "传来的指定字段的手机号的值")String phone, @ApiParam(value = "传来的指定字段的密码的值")String password){
        return us.login(phone,password);
    }
    @ApiOperation("注册")
    @PostMapping("insertUser.do")
    public ResultVo insertUser(@ApiParam(value = "传来的用户对象")User user){
        return us.insertUser(user);
    }
}
