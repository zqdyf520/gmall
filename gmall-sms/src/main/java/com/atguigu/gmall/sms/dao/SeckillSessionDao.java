package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.SeckillSessionEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 秒杀活动场次
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2019-10-31 14:33:25
 */
@Mapper
public interface SeckillSessionDao extends BaseMapper<SeckillSessionEntity> {
	
}
