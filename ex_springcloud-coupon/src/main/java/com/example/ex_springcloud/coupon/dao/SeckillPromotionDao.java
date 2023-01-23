package com.example.ex_springcloud.coupon.dao;

import com.example.ex_springcloud.coupon.entity.SeckillPromotionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 21:00:05
 */
@Mapper
public interface SeckillPromotionDao extends BaseMapper<SeckillPromotionEntity> {
	
}
