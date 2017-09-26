package com.yada.service;

import com.baomidou.mybatisplus.service.IService;
import com.yada.commons.result.PageInfo;
import com.yada.model.SysLog;

/**
 * SysLog 表数据服务层接口
 */
public interface ISysLogService extends IService<SysLog> {

    void selectDataGrid(PageInfo pageInfo);

}