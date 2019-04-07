package com.fengyuan.greens.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.fengyuan.greens.entity.TComment;
import com.fengyuan.greens.vo.ResultVo;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author fengyuan
 * @since 2019-04-02
 */
public interface TCommentService extends IService<TComment> {
    //根据用户id查询
    ResultVo selectByUserId(Integer uid);
    //根据用户id添加
    ResultVo insertComment(String token, int gid);

}
