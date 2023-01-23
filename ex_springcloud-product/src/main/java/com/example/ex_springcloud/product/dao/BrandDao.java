package com.example.ex_springcloud.product.dao;

import com.example.ex_springcloud.product.entity.BrandEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 品牌
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:02
 */
@Mapper
public interface BrandDao extends BaseMapper<BrandEntity> {
	
}
