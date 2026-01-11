package com.wangfan.scheme1.entity;

import lombok.Data;

import java.math.BigDecimal;

/**
 * 打折券操作响应结果封装类
 */
@Data
public class DiscountResult {

    private Boolean isSuccess; // 是否成功

    private String errorCode; // 错误码

    private String errorMsg; // 错误信息

    private String discountId; // 打折券ID

    private String uid; // 用户ID

    private BigDecimal discountRate; // 应用的折扣率

    private BigDecimal originalPrice; // 原价

    private BigDecimal discountedPrice; // 折后价格

    private Long useTime; // 使用时间

    private String activityId; // 关联活动ID

    public DiscountResult(String errorCode, String errorMsg) {
        this.errorCode = errorCode;
        this.errorMsg = errorMsg;
    }
}
