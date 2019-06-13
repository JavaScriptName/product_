package cn.bx.vo;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

/**
 * @author cxh出品
 * @Package cn.bx.vo
 * @date 2019/6/11/20:45
 */

@Data
public class ProductVO {


    @JsonProperty("name")
    private  String categoryName;

    @JsonProperty("type")
    private  Integer categoryType;

    @JsonProperty("foods")
    List<ProductInfoVO> ProductInfoVO ;

}
