package com.example.ex_springcloud.coupon;

import com.example.ex_springcloud.coupon.entity.CouponEntity;
import com.example.ex_springcloud.coupon.service.CouponService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ExSpringcloudCouponApplicationTests {

    @Autowired
    CouponService couponService;

    @Test
    void contextLoads() {
        CouponEntity couponEntity = new CouponEntity();
        couponEntity.setCouponName("testCoupon");
        couponService.save(couponEntity);

    }

}
