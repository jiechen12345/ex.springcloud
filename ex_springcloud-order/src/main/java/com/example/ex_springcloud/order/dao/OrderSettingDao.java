package com.example.ex_springcloud.order.dao;

import com.example.ex_springcloud.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 23:21:20
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
