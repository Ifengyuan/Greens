package com.fengyuan.greens.controller;

import com.fengyuan.greens.entity.TGoodstype;
import com.fengyuan.greens.entity.TShppingcar;
import com.fengyuan.greens.service.TShppingcarService;
import com.fengyuan.greens.vo.ResultVo;
import com.fengyuan.greens.vo.VShoppingCar;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
@Api(value = "购物车Controller",tags = "购物车模块接口")
@RestController
@CrossOrigin
public class TShppingcarController {
	@Autowired
    private TShppingcarService ss;

    @ApiOperation("根据用户id查的订单")
    @GetMapping("selectBySUid.do")
    public List<VShoppingCar> selectBySUid(Integer uid){
        return ss.selectBySUid(uid);
    }

    @ApiOperation("添加订单")
    @PostMapping("insertShopping.do")
    public ResultVo insertShopping(TShppingcar tShppingcar){
        return ss.insertShopping(tShppingcar);
    }

    @ApiOperation("根据用户id删除订单")
    @PostMapping("deleteByid.do")
    public ResultVo deleteByid(Integer id){
        return ss.deleteById(id);
    }
}
