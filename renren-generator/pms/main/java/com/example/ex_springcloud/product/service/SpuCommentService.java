package com.example.ex_springcloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ex_springcloud.product.entity.SpuCommentEntity;

import java.util.Map;

/**
 * 商品评价
 *
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:01
 */
public interface SpuCommentService extends IService<SpuCommentEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

