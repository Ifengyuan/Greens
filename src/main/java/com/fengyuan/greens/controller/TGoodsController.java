package com.fengyuan.greens.controller;

import com.fengyuan.greens.entity.TGoods;
import com.fengyuan.greens.service.TGoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
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
@Api(value = "商品Controller",tags = "商品模块接口")
@RestController
@CrossOrigin
public class TGoodsController {
	@Autowired
    private TGoodsService tgs;
    @ApiOperation("根据类型查看商品")
    @GetMapping("selectByType.do")
    public List<TGoods> selectByType(@ApiParam(value = "传来的指定字段的类型的值")Integer type){
        return tgs.selectType(type);
    }
}
