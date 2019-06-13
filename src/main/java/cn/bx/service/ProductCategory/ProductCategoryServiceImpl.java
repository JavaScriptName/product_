package cn.bx.service.ProductCategory;

import cn.bx.dao.ProductCategoryMapper;
import cn.bx.entity.ProductCategory;
import cn.bx.enums.ProductStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author cxh出品
 * @Package cn.bx.service.ProductCategory
 * @date 2019/6/11/21:14
 */

@Service
@Slf4j
public class ProductCategoryServiceImpl implements ProductCategoryService{

    @Autowired
    private ProductCategoryMapper productCategoryMapper;

//    @Override
//    public List<ProductCategory> getcategoryType() {
//        log.info("ProductCategoryServiceImpl-getcategoryType方法执行");
//        return productCategoryMapper.findStatusAll(ProductStatusEnum.UP.getCode());
//    }

//    @Override
//    public List<Integer> getcategoryTypeAll() {
//        log.info("ProductCategoryServiceImpl-getcategoryTypeAll方法执行");
//        return ProductCategoryMapper.getcategoryTypeAll();
//    }
}
