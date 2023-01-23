package com.example.ex_springcloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ex_springcloud.product.entity.UndoLogEntity;

import java.util.Map;

/**
 * 
 *
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:01
 */
public interface UndoLogService extends IService<UndoLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

