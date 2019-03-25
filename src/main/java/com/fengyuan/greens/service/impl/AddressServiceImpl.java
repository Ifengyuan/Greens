package com.fengyuan.greens.service.impl;

import com.fengyuan.greens.dao.AddressMapper;
import com.fengyuan.greens.entity.Address;
import com.fengyuan.greens.entity.User;
import com.fengyuan.greens.service.AddService;
import com.fengyuan.greens.util.ResultUtil;
import com.fengyuan.greens.vo.ResultVo;
import com.fengyuan.greens.vo.VAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: fengyuan
 * @Description: 该类的功能描述
 * @date: 2019/3/25 21:01
 */
@Service
public class AddressServiceImpl implements AddService {
    private ResultVo rv;
    @Autowired
    private AddressMapper am;
    @Override
    public List<VAddress> selecByUId(Integer uid) {
        List<VAddress> address = null;
        try {
            address = am.selectByUid(uid);
            rv = ResultVo.setOK(address);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return address;
    }

    @Override
    public ResultVo insertAddress(Address address) {
        try {
            am.insert(address);
            return ResultUtil.exec(true,"OK",address);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"添加失败",null);
        }
    }
}
