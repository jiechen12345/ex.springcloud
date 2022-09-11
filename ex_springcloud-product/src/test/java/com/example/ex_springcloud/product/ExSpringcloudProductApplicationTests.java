package com.example.ex_springcloud.product;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.ex_springcloud.product.entity.BrandEntity;
import com.example.ex_springcloud.product.service.BrandService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class ExSpringcloudProductApplicationTests {
    @Autowired
    BrandService brandServicel;

    @Test
    void contextLoads() {
        BrandEntity brandEntity = new BrandEntity();
//        brandEntity.setName("HTC");
//        brandServicel.save(brandEntity);

//        brandEntity.setBrandId(1L);
//        brandEntity.setDescript("haha..");
//        brandServicel.updateById(brandEntity);

       List<BrandEntity>brandEntities= brandServicel.list(new QueryWrapper<BrandEntity>().eq("brand_id",1));
       brandEntities.forEach(item->{
           System.out.println(item);
       });
        System.out.println("OK....");
    }

}
