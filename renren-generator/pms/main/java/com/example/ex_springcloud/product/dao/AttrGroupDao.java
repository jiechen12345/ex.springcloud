package com.example.ex_springcloud.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ex_springcloud.product.entity.AttrGroupEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 属性分组
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:02
 */
@Mapper
public interface AttrGroupDao extends BaseMapper<AttrGroupEntity> {
	
}
