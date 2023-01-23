package com.example.ex_springcloud.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ex_springcloud.product.entity.SpuCommentEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:01
 */
@Mapper
public interface SpuCommentDao extends BaseMapper<SpuCommentEntity> {
	
}
