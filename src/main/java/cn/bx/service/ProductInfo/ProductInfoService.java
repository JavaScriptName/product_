package cn.bx.service.ProductInfo;

import cn.bx.entity.ProductInfo;

import java.util.List;

/**
 * @author cxh出品
 * @Package cn.bx.service.ProductInfo
 * @date 2019/6/11/21:10
 */
public interface ProductInfoService {

    /**
     * 查询所有上架数据
     * @return List<ProductCategory>
     */
    List<ProductInfo> findStatusAll();
}
