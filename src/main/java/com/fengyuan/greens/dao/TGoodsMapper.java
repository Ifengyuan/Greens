package com.fengyuan.greens.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengyuan.greens.entity.TGoods;

import java.util.List;


/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
public interface TGoodsMapper extends BaseMapper<TGoods> {
    List<TGoods> selectByType(Integer type);

}