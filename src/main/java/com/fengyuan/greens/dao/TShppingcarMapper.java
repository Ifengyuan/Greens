package com.fengyuan.greens.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengyuan.greens.entity.TShppingcar;
import com.fengyuan.greens.vo.VShoppingCar;

import java.util.List;


/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
public interface TShppingcarMapper extends BaseMapper<TShppingcar> {
    List<VShoppingCar> selectBySUid(Integer uid);
}