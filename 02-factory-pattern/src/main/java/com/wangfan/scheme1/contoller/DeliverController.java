package com.wangfan.scheme1.contoller;

import cn.hutool.core.lang.UUID;
import cn.hutool.json.JSONUtil;
import com.wangfan.scheme1.entity.AwardInfo;
import com.wangfan.scheme1.entity.DiscountResult;
import com.wangfan.scheme1.entity.SmallGiftInfo;
import com.wangfan.scheme1.service.DiscountService;
import com.wangfan.scheme1.service.SmallGiftService;
import com.wangfan.scheme1.service.YouKuMemberService;

/**
 * 发放奖品接口
 */
public class DeliverController {
    /**
     * 按照类型的不同发放商品
     *     奖品类型: 1 打折券 ,2 优酷会员,3 小礼品
     */
    public void awardToUser(AwardInfo awardInfo){

        if(awardInfo.getAwardType() == 1){ //打折券
            DiscountService discountService = new DiscountService();
            DiscountResult result = discountService.sendDiscount(awardInfo.getUid(), awardInfo.getAwardNumber());
            System.out.println("打折券发放成功!"+ JSONUtil.toJsonStr(result));

        }
        else if(awardInfo.getAwardType() == 2){ //优酷会员
            //获取用户手机号
            String bindMobile = awardInfo.getExtMap().get("phone");

            //调用service
            YouKuMemberService youKuMemberService = new YouKuMemberService();
            youKuMemberService.openMember(bindMobile,awardInfo.getAwardNumber());
            System.out.println("优酷会员发放成功!");

        }
        else if(awardInfo.getAwardType() == 3){ /*
            小礼品
            封装收货用户信息
            */
            SmallGiftInfo smallGiftInfo = new SmallGiftInfo();
            smallGiftInfo.setUserName(awardInfo.getExtMap().get("username"));
            smallGiftInfo.setOrderId(UUID.randomUUID().toString());
            smallGiftInfo.setRelAddress(awardInfo.getExtMap().get("adderss"));

            SmallGiftService smallGiftService = new SmallGiftService();
            Boolean isSuccess = smallGiftService.giveSmallGift(smallGiftInfo);
            System.out.println("小礼品发放成功!" + isSuccess);
        }
    }
}
