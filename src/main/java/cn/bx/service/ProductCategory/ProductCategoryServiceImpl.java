package cn.bx.service.ProductCategory;

import cn.bx.dao.ProductCategoryMapper;
import cn.bx.entity.ProductCategory;
import cn.bx.enums.ProductStatusEnum;
import cn.bx.util.CommonMap;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.sun.org.apache.xerces.internal.util.EntityResolverWrapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Wrapper;
import java.util.ArrayList;
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


    @Override
    public List<ProductCategory> getCategoryTypeList(List<Integer> categoryTypeList) {
        log.info("进入ProductCategoryServiceImpl方法：getCategoryTypeList");
        return productCategoryMapper.selectList( new QueryWrapper<ProductCategory>().in("category_type",categoryTypeList));
    }
}
