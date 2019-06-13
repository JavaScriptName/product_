package cn.bx.service.ProductInfo;

import cn.bx.dao.ProductInfoMapper;
import cn.bx.entity.ProductInfo;
import cn.bx.enums.ProductStatusEnum;
import cn.bx.util.CommonMap;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/**
 * @author cxh出品
 * @Package cn.bx.service.ProductCategory
 * @date 2019/6/11/21:14
 */

@Service
@Slf4j
public class ProductInfoServiceImpl implements ProductInfoService{

    @Autowired
    private ProductInfoMapper productInfoMapper;


    @Override
    public List<ProductInfo> findStatusAll() {

        log.info("ProductInfoServiceImpl-getProductStatus方法执行");
        productInfoMapper.selectByMap(CommonMap.getProductMap("product_status",ProductStatusEnum.UP.getCode()));

        return null;
    }
}
