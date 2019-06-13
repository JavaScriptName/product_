package cn.bx.entity;

import java.io.Serializable;
import java.util.Date;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 
 * 
 * @author cxh
 * 
 * @date 2019-06-10
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName(value = "product_category")
public class ProductCategory  implements Serializable {

    /**
     * type = IdType.AUTO 自增
     * value = "id" 数据库id名称
     */
    @TableId(value = "category_Id",type = IdType.AUTO)
    private Integer categoryId;

    /**
     * 类目名字
     */

    private String categoryName;

    /**
     * 类目编号
     */
    private Integer categoryType;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 修改时间
     */
    private Date updateTime;

   
}