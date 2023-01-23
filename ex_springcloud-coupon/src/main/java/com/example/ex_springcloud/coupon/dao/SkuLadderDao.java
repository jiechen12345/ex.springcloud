package com.example.ex_springcloud.coupon.dao;

import com.example.ex_springcloud.coupon.entity.SkuLadderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品阶梯价格
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 21:00:05
 */
@Mapper
public interface SkuLadderDao extends BaseMapper<SkuLadderEntity> {
	
}
