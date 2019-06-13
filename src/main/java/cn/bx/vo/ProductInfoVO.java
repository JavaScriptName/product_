package cn.bx.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @author cxh出品
 * @Package cn.bx.vo
 * @date 2019/6/11/20:52
 */

@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private  String productId;
    /**
     * 商品名称
     */
    @JsonProperty("name")
    private String productName;
    /**
     * 单价
     */
    @JsonProperty("price")
    private BigDecimal productPrice;
    /**
     * 描述
     */
    @JsonProperty("description")
    private BigDecimal productDescription;
    /**
     * 小图
     */
    @JsonProperty("icon")
    private BigDecimal productIcon;

}
