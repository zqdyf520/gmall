package com.atguigu.gmall.sms.dao;

import com.atguigu.gmall.sms.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author lixianfeng
 * @email lxf@atguigu.com
 * @date 2019-10-31 14:33:10
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
