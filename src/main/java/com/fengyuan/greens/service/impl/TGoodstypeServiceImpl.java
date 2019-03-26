package com.fengyuan.greens.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengyuan.greens.dao.TGoodstypeMapper;
import com.fengyuan.greens.entity.TGoodstype;
import com.fengyuan.greens.service.TGoodstypeService;
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
public class TGoodstypeServiceImpl extends ServiceImpl<TGoodstypeMapper, TGoodstype> implements TGoodstypeService {
    private ResultVo rv;
    @Autowired
    private TGoodstypeMapper gtm;
    @Override
    public List<TGoodstype> selectAll() {
        List<TGoodstype> list = null;
        try {
            list = gtm.selectAll();
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return list;
    }
}
