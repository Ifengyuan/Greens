package com.fengyuan.greens.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.fengyuan.greens.entity.TGoods;
import com.fengyuan.greens.service.TGoodsService;
import com.fengyuan.greens.util.ResultUtil;
import com.fengyuan.greens.vo.ResultVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
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

    @ApiOperation("增加")
    @PostMapping("addGood.do")
    public boolean addGood(TGoods tGoods){
        return tgs.save(tGoods);
    }
    @ApiOperation("修改")
    @GetMapping("updatesd.do")
    public ResultVo updatesd(TGoods tGoods, Integer id){
        QueryWrapper<TGoods> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("id",id);
        return tgs.update(tGoods,queryWrapper)? ResultUtil.exec(true,"OK",null):ResultUtil.exec(false,"ERROR",null);
    }
}
