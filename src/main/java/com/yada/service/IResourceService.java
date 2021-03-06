package com.yada.service;

import com.baomidou.mybatisplus.service.IService;
import com.yada.commons.result.Tree;
import com.yada.commons.shiro.ShiroUser;
import com.yada.model.Resource;

import java.util.List;

/**
 * Resource 表数据服务层接口
 */
public interface IResourceService extends IService<Resource> {

    List<Resource> selectAll();

    List<Tree> selectAllMenu();

    List<Tree> selectAllTree();

    List<Tree> selectTree(ShiroUser shiroUser);

}