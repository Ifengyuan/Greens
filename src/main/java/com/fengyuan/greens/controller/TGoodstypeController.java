package com.fengyuan.greens.controller;

import com.fengyuan.greens.entity.TGoodstype;
import com.fengyuan.greens.service.TGoodstypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
@Api(value = "类型Controller",tags = "类型模块接口")
@RestController
@CrossOrigin
public class TGoodstypeController {
    @Autowired
    private TGoodstypeService tgts;

    @ApiOperation("查看所有类型")
    @GetMapping("selectByAll.do")
    public List<TGoodstype> selectByAll(){
        return tgts.selectAll();
    }
}
