package com.fengyuan.greens.controller;

import com.fengyuan.greens.entity.TGoods;
import com.fengyuan.greens.service.TGoodsService;
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
@Api(value = "地址Controller",tags = "地址模块接口")
@RestController
@CrossOrigin
public class TGoodsController {
	@Autowired
    private TGoodsService tgs;
    @ApiOperation("查看用户的地址")
    @GetMapping("selectByType.do")
    public List<TGoods> selectByType(Integer type){
        return tgs.selectType(type);
    }
}
