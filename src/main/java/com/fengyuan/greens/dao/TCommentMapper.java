package com.fengyuan.greens.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.fengyuan.greens.entity.TComment;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author fengyuan
 * @since 2019-04-02
 */
public interface TCommentMapper extends BaseMapper<TComment> {
    //根据uid查询
    List<TComment> selectByUserId(Integer uid);
    //根据gid查询
    TComment selectByGoodsId(TComment tComment);

}