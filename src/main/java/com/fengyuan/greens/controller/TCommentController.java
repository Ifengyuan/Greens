package com.fengyuan.greens.controller;

import com.fengyuan.greens.service.TCommentService;
import com.fengyuan.greens.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
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
 * @since 2019-04-02
 */
@Api(value = "评论Controller",tags = "评论模块接口")
@Controller
@RequestMapping("/fengyuan.greens/tComment")
public class TCommentController {
    @Autowired
    private TCommentService tcs;
    @ApiOperation("查看用户的id查询")
    @GetMapping("selectByUserid.do")
    public ResultVo selectByUId(Integer uid){
        return tcs.selectByUserId(uid);
    }
    @ApiOperation("根据id删除")
    @GetMapping("deleteByUserid.do")
    public boolean deleteByUid(Integer id){
        return tcs.removeById(id);
    }
    @ApiOperation("添加评论")
    @GetMapping("insertComment.do")
    public ResultVo insertComment(String token,int gid){
        return tcs.insertComment(token, gid);
    }
}
