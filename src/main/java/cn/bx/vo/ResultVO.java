package cn.bx.vo;

import lombok.Data;

/**
 * @author cxh出品
 * @Package cn.bx.vo
 * @date 2019/6/11/20:44
 */

@Data
public class ResultVO<T> {

    /**
     * 错误码
     */
    private  Integer code;

    /**
     * 提示信息
     */
    private  String message;

    /**
     * 具体内容
     */
    private  T data;


}
