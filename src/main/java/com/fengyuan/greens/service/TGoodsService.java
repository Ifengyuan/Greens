package com.fengyuan.greens.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengyuan.greens.entity.TGoods;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
public interface TGoodsService extends IService<TGoods> {
	List<TGoods> selectType(Integer type);
}
