package cn.bx.service.ProductCategory;

import cn.bx.entity.ProductCategory;

import java.util.List;

/**
 * @author cxh出品
 * @Package cn.bx.service.ProductCategory
 * @date 2019/6/11/21:10
 */
public interface ProductCategoryService {

    /**
     * 从数据库查询类目
     * @param categoryTypeList
     * @return
     */
    public List<ProductCategory> getCategoryTypeList(List<Integer> categoryTypeList);

}
