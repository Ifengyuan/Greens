package com.fengyuan.greens.service;

import com.fengyuan.greens.entity.Address;
import com.fengyuan.greens.vo.ResultVo;
import com.fengyuan.greens.vo.VAddress;

import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/25 20:58
 */
public interface AddService {
    List<VAddress> selecByUId(Integer uid);

    ResultVo insertAddress(Address address);
}
