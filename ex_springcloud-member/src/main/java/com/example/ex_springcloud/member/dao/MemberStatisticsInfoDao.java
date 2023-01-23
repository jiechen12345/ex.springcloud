package com.example.ex_springcloud.member.dao;

import com.example.ex_springcloud.member.entity.MemberStatisticsInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员统计信息
 * 
 * @author JayChen
 * @email cheners123@gmail.com
 * @date 2022-09-11 22:54:38
 */
@Mapper
public interface MemberStatisticsInfoDao extends BaseMapper<MemberStatisticsInfoEntity> {
	
}
