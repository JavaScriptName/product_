package cn.bx.dao;


import cn.bx.entity.ProductCategory;
import cn.bx.entity.ProductInfo;
import cn.bx.enums.ProductStatusEnum;
import cn.bx.util.CommonMap;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.apache.catalina.User;
import org.junit.Test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ProductTest {

    @Autowired
    private ProductInfoMapper productInfoMapper;
    @Autowired
    private ProductCategoryMapper productCategoryMapper;


//    @Test
//    /**
//     * 查询在架
//     */
//    public void getProductStatus() throws  Exception{
//        log.info("ProductInfoServiceImpl-getProductStatus方法执行");
//        List<ProductInfo> ProductInfo = ProductInfoMapper.findStatusAll(ProductStatusEnum.UP.getCode());
//        log.info("getProductStatus 查询数量："+ProductInfo.size());
//
//    }
//
//    @Test
//    /**
//     * 查询类目
//     */
//    public void getcategoryType() throws  Exception{
////        List<ProductCategory> ProductCategory = productCategoryMapper.getcategoryType(22);
////        log.info("getcategoryType 查询数量："+ProductCategory.size());
//    }

    @Test
    public void allProductStatusList(){
        log.info("ProductInfoServiceImpl-getProductStatus方法执行");
        List<ProductInfo> productInfoList = productInfoMapper.selectByMap(CommonMap.getProductMap("product_status",ProductStatusEnum.UP.getCode()));
        log.info("数据大小："+productInfoList.size());
    }
}
