package cn.bx.util;

import cn.bx.vo.ResultVO;

/**
 * @author cxh出品
 * @Package cn.bx.util
 * @date 2019/6/13/20:21
 */


public class ResultVOUtil {

    public static ResultVO success(Object object) {
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMessage("成功");
        return resultVO;
    }
}
