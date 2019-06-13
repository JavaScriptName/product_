package cn.bx.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.bx.dao.ProductInfoMapper;
import cn.bx.entity.ProductInfo;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class ProductInfoController {

	@Autowired
	private ProductInfoMapper productInfoMapper;
//
//	@RequestMapping("getProductInfo/{productStatus}")
//	public List<ProductInfo> getProductInfo(@PathVariable("productStatus")Integer productStatus){
//
//		log.info("进入方法："+productStatus);
//		return productInfoMapper.getProductStatus(productStatus);
//
//	}
}
