package com.wangfan.scheme1.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 打折券信息对应实体类
 */
@Data
public class DiscountInfo {

    private String discountId; // 打折券唯一ID

    private String uid; // 用户唯一ID

    private String discountName; // 打折券名称

    private BigDecimal discountRate; // 折扣率，如0.8表示8折

    private BigDecimal minOrderAmount; // 最小订单金额

    private String description; // 打折券描述

    private Long createTime; // 创建时间

    private Long expireTime; // 过期时间

    private Integer status; // 状态：0未使用 1已使用 2已过期

    private String activityId; // 关联活动ID
}
