package com.example.ex_springcloud.member.feign;

import com.example.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by JieChen on 2022/9/13.
 */
@FeignClient("coupon") //調用coupon服務 application.yㄙml註冊名
public interface CouponFeignService {

    @RequestMapping(value = "/coupon/coupon/member/list", method = RequestMethod.GET)
        //調用這個url
    R memberCoupons();
}
