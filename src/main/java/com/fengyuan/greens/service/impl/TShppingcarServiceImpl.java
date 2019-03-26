package com.fengyuan.greens.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengyuan.greens.dao.TShppingcarMapper;
import com.fengyuan.greens.entity.TShppingcar;
import com.fengyuan.greens.service.TShppingcarService;
import com.fengyuan.greens.util.ResultUtil;
import com.fengyuan.greens.vo.ResultVo;
import com.fengyuan.greens.vo.VShoppingCar;
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
public class TShppingcarServiceImpl extends ServiceImpl<TShppingcarMapper, TShppingcar> implements TShppingcarService {
    private ResultVo rv;
    @Autowired
    private TShppingcarMapper tsm;
    @Override
    public List<VShoppingCar> selectBySUid(Integer uid) {
        List<VShoppingCar> list = null;
        try {
            list = tsm.selectBySUid(uid);
            rv = ResultVo.setOK(list);
        } catch (Exception e) {
            e.printStackTrace();
            rv = ResultVo.setERROR();
        }
        return list;
    }

    @Override
    public ResultVo insertShopping(TShppingcar tShppingcar) {
        try {
            tsm.insert(tShppingcar);
            return ResultUtil.exec(true,"OK",tShppingcar);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"添加失败请稍等",null);
        }
    }

    @Override
    public ResultVo deleteById(Integer id) {
        try {
            tsm.deleteById(id);
            return ResultUtil.exec(true,"OK",id);
        } catch (Exception e) {
            e.printStackTrace();
            return ResultUtil.exec(false,"删除失败",null);
        }
    }
}
