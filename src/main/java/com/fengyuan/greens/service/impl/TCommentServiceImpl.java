package com.fengyuan.greens.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengyuan.greens.dao.TCommentMapper;
import com.fengyuan.greens.entity.TComment;
import com.fengyuan.greens.service.TCommentService;
import com.fengyuan.greens.token.TokenUtil;
import com.fengyuan.greens.util.ResultUtil;
import com.fengyuan.greens.vo.ResultVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fengyuan
 * @since 2019-04-02
 */
@Service
public class TCommentServiceImpl extends ServiceImpl<TCommentMapper, TComment> implements TCommentService {
    @Autowired
    private TCommentMapper tCommentMapper;
    @Override
    public ResultVo selectByUserId(Integer uid) {

        return ResultUtil.exec(true,"OK",tCommentMapper.selectByUserId(uid));
    }

    @Override
    public ResultVo insertComment(String token, int gid) {
        int i = TokenUtil.parseToken(token).getId();
        TComment c = new TComment();
        c.setGid(gid);
        c.setUid(i);

        TComment tc = new TComment();
        tc.setUid(gid);
        tc.setUid(i);
        TComment tComment = tCommentMapper.selectByGoodsId(c);
        if (tComment == null){
            Integer tcm = tCommentMapper.insert(tc);
            if (tcm>0){
                return ResultUtil.exec(true,"OK",null);
            }
        }
        return ResultUtil.exec(false,"添加失败",null);
    }
}
