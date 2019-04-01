package com.fengyuan.greens.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.fengyuan.greens.dao.TUserMapper;
import com.fengyuan.greens.entity.TUser;
import com.fengyuan.greens.service.TUserService;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author fengyuan
 * @since 2019-03-25
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {
	
}
