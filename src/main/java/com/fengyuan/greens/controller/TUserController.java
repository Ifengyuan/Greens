package com.fengyuan.greens.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fengyuan.greens.entity.TUser;
import com.fengyuan.greens.service.TUserService;
import com.fengyuan.greens.util.ResultUtil;
import com.fengyuan.greens.vo.ResultVo;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
@Controller
@RequestMapping("/fengyuan.greens/tUser")
public class TUserController {
	@Autowired
    private TUserService tus;
   @ApiOperation("修改")
    @GetMapping("updateUser.do")
    public ResultVo updateUser(TUser user, Integer id){
        QueryWrapper<TUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return tus.update(user,queryWrapper) ? ResultUtil.exec(true,"OK",null):ResultUtil.exec(false,"ERROR",null);
    }
}
