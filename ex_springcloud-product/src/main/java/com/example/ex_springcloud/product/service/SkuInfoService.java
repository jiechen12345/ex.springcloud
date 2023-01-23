package com.example.ex_springcloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ex_springcloud.product.entity.SkuInfoEntity;

import java.util.Map;

/**
 * sku信息
 *
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:02
 */
public interface SkuInfoService extends IService<SkuInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

