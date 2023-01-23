package com.example.ex_springcloud.ware.dao;

import com.example.ex_springcloud.ware.entity.WareOrderTaskEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 库存工作单
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 23:24:16
 */
@Mapper
public interface WareOrderTaskDao extends BaseMapper<WareOrderTaskEntity> {
	
}
