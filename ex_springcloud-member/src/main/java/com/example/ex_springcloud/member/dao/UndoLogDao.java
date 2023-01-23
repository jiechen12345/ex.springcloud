package com.example.ex_springcloud.member.dao;

import com.example.ex_springcloud.member.entity.UndoLogEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 22:54:38
 */
@Mapper
public interface UndoLogDao extends BaseMapper<UndoLogEntity> {
	
}
