package com.fengyuan.greens.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengyuan.greens.dao.TGoodsMapper;
import com.fengyuan.greens.entity.TGoods;
import com.fengyuan.greens.service.TGoodsService;

import com.fengyuan.greens.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
@Service
public class TGoodsServiceImpl extends ServiceImpl<TGoodsMapper, TGoods> implements TGoodsService {
    private ResultVo rv;
    @Autowired
    private TGoodsMapper tgm;
    @Override
    public List<TGoods> selectType(Integer type) {
        List<TGoods> list = null;
        try {
            list = tgm.selectByType(type);
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return list;
    }
}
