package cn.bx.enums;

import lombok.Getter;

/**
 * @author cxh出品
 * @Package cn.bx.enums
 * @date 2019/6/13/16:02
 */
@Getter
public enum  CommonEnum {

    succeed(0,"成功"),
    loser(1,"失败"),
    ;

    private Integer code;
    private  String message;

    CommonEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
