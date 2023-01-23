package com.example.ex_springcloud.order.dao;

import com.example.ex_springcloud.order.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 23:21:20
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
