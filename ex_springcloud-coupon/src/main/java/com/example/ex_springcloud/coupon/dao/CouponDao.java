package com.example.ex_springcloud.coupon.dao;

import com.example.ex_springcloud.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 21:00:05
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}