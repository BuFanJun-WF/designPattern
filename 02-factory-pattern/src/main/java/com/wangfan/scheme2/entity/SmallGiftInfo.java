package com.wangfan.scheme2.entity;

import lombok.Data;

/**
 * 小礼品信息对应实体类
 */
@Data
public class SmallGiftInfo {
    private String userName;              // 用户姓名
    private String userPhone;             // 用户手机
    private String orderId;               // 订单ID
    private String relAddress;            // 收货地址
}
