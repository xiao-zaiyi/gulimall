package com.august.gulimall.coupon.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.august.gulimall.common.service.impl.CrudServiceImpl;
import com.august.gulimall.coupon.dao.CouponSpuCategoryRelationDao;
import com.august.gulimall.coupon.dto.CouponSpuCategoryRelationDTO;
import com.august.gulimall.coupon.entity.CouponSpuCategoryRelationEntity;
import com.august.gulimall.coupon.service.CouponSpuCategoryRelationService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import java.util.Map;

/**
 * 优惠券分类关联
 *
 * @author august xiao1932794922@gmail.com
 * @since 1.0.0 2022-10-16
 */
@Service
public class CouponSpuCategoryRelationServiceImpl extends CrudServiceImpl<CouponSpuCategoryRelationDao, CouponSpuCategoryRelationEntity, CouponSpuCategoryRelationDTO> implements CouponSpuCategoryRelationService {

    @Override
    public QueryWrapper<CouponSpuCategoryRelationEntity> getWrapper(Map<String, Object> params){
        String id = (String)params.get("id");

        QueryWrapper<CouponSpuCategoryRelationEntity> wrapper = new QueryWrapper<>();
        wrapper.eq(StringUtils.isNotBlank(id), "id", id);

        return wrapper;
    }


}