package com.yada.service.impl;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.yada.mapper.UserRoleMapper;
import com.yada.model.UserRole;
import com.yada.service.IUserRoleService;
import org.springframework.stereotype.Service;

/**
 * UserRole 表数据服务层接口实现类
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}