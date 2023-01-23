package com.example.ex_springcloud.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ex_springcloud.product.entity.CategoryEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:02
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
