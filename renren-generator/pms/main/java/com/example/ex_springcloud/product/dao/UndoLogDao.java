package com.example.ex_springcloud.product.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.ex_springcloud.product.entity.UndoLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-10 18:51:01
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
