package com.example.ex_springcloud.order.dao;

import com.example.ex_springcloud.order.entity.OrderReturnApplyEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单退货申请
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 23:21:20
 */
@Mapper
public interface OrderReturnApplyDao extends BaseMapper<OrderReturnApplyEntity> {
	
}
