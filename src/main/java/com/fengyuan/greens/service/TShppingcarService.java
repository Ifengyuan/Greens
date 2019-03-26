package com.fengyuan.greens.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengyuan.greens.entity.TShppingcar;
import com.fengyuan.greens.vo.ResultVo;
import com.fengyuan.greens.vo.VShoppingCar;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
public interface TShppingcarService extends IService<TShppingcar> {
	List<VShoppingCar> selectBySUid(Integer uid);

	ResultVo insertShopping(TShppingcar tShppingcar);

	ResultVo deleteById(Integer id);
}
