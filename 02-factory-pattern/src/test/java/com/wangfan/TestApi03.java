package com.wangfan;

import com.wangfan.scheme2.entity.AwardInfo;
import com.wangfan.scheme2.entity.ResponseResult;
import com.wangfan.scheme3.controller.DeliverController;
import org.junit.jupiter.api.Test;

public class TestApi03 {
    DeliverController deliverController = new DeliverController();

    @Test
    public void test01(){

        //1. 发放打折券优惠
        AwardInfo info1 = new AwardInfo();
        info1.setUid("1001");
        info1.setAwardType(1);
        info1.setAwardNumber("DEL12345");

        ResponseResult result = deliverController.awardToUser(info1);
        System.out.println(result);

    }

}
