package com.fengyuan.greens.dao;

import com.fengyuan.greens.entity.Address;
import com.fengyuan.greens.vo.VAddress;

import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<VAddress> selectByUid(Integer uid);
}