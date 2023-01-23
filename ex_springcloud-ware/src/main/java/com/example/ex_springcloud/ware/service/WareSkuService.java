package com.example.ex_springcloud.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ex_springcloud.ware.entity.WareSkuEntity;

import java.util.Map;

/**
 * 商品库存
 *
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 23:24:16
 */
public interface WareSkuService extends IService<WareSkuEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

