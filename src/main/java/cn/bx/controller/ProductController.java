package cn.bx.controller;

import cn.bx.dao.ProductCategoryMapper;
import cn.bx.dao.ProductInfoMapper;
import cn.bx.entity.ProductInfo;
import cn.bx.service.ProductCategory.ProductCategoryService;
import cn.bx.service.ProductInfo.ProductInfoService;
import cn.bx.vo.ProductVO;
import cn.bx.vo.ResultVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author cxh
 * @date 2016/10/31
 */

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductCategoryService productCategoryService;
    @Autowired
    private ProductInfoService productInfoService;

    /**
     * 1.查询所有在架商品
     * 2.获取类目type列表
     * 3.查询类目
     * 4.构造数据
     */
//    @GetMapping("/List")
//    public ResultVO<ProductVO> list(){
//        //1.查询所有在架商品
//         List<ProductInfo> ProductInfoList = productInfoService.getProductStatusUpAll();
//       // 2.获取类目type列表
//        List<Integer> CategoryTypeList =  ProductInfoList.stream()
//                .map(ProductInfo::getCategoryType)
//                .collect(Collectors.toList());
//
//        //3.查询类目
//
//
//    }
}
