package com.fengyuan.greens.controller;

import com.fengyuan.greens.entity.Address;
import com.fengyuan.greens.service.AddService;
import com.fengyuan.greens.vo.ResultVo;
import com.fengyuan.greens.vo.VAddress;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/25 21:21
 */
@Api(value = "地址Controller",tags = "地址模块接口")
@RestController
@CrossOrigin
public class AddressController {
    @Autowired
    private AddService as;
    @ApiOperation("查看用户的地址")
    @GetMapping("selectByUid.do")
    public List<VAddress> selectByUid(Integer uid){
        return as.selecByUId(uid);
    }
    @ApiOperation("添加地址")
    @PostMapping("insertAddress.do")
    public ResultVo insertAddress(Address address){
        return as.insertAddress(address);
    }

}
