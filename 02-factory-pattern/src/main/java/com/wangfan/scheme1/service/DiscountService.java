package com.wangfan.scheme1.service;

import com.wangfan.scheme1.entity.DiscountResult;

/**
 * 模拟打折券服务
 */
public class DiscountService {
    public DiscountResult sendDiscount(String uid, String number){

        System.out.println("向用户发放打折券一张: " + uid + " , " + number);
        return new DiscountResult("200","发放打折券成功");
    }
}
