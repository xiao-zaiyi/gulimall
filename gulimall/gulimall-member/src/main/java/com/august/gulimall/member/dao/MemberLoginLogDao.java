package com.august.gulimall.member.dao;

import com.august.gulimall.common.dao.BaseDao;
import com.august.gulimall.member.entity.MemberLoginLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员登录记录
 *
 * @author august xiao1932794922@gmail.com
 * @since 1.0.0 2022-10-16
 */
@Mapper
public interface MemberLoginLogDao extends BaseDao<MemberLoginLogEntity> {
	
}