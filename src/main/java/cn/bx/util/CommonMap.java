package cn.bx.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.util.HashMap;
import java.util.Map;

/**
 * @author cxh出品
 * @Package cn.bx.util
 * @date 2019/6/13/1:27
 */

@Data
public class CommonMap {

    private static  Map<String,Object> productMap;

    /**
     * 配合使用mybatis-plus的selectByMap条件查询
     * @param key 数据库表对应属性
     * @param value 对应查询的值
     * @return
     */
   public static Map<String,Object> getProductMap(String key,Object value){
       productMap =new HashMap<>();
       productMap.put(key,value);
       return productMap;
    }

}
