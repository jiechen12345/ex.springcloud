package com.example.ex_springcloud.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ex_springcloud.product.entity.SpuImagesEntity;

import java.util.Map;

/**
 * spu图片
 *
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:01
 */
public interface SpuImagesService extends IService<SpuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

