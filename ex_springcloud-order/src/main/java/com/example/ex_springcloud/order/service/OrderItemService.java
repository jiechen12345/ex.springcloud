package com.example.ex_springcloud.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.example.common.utils.PageUtils;
import com.example.ex_springcloud.order.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 23:21:20
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

