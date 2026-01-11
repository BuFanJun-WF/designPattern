package com.wangfan.scheme1.entity;

import lombok.Data;

/**
 * 优酷会员对应实体类
 */
@Data
public class YouKuMember {

    private String memberId;         // 会员ID
    private String uid;              // 用户唯一ID
    private String memberName;       // 会员姓名
    private String memberType;       // 会员类型 (如：月度会员、年度会员)
    private String memberLevel;      // 会员等级
    private Long startTime;          // 会员开始时间
    private Long endTime;            // 会员结束时间
    private Integer duration;        // 会员时长(天)
    private String orderId;          // 订单ID
    private String status;           // 会员状态 (如：正常、过期、冻结)
    private String phone;            // 绑定手机号
    private String email;            // 绑定邮箱
}
