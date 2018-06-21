package com.imooc.sell.utils;

import com.imooc.sell.vo.ResultVO;

/*
@Author: llb
@Date : 2018/6/13 17:37
*/
public class ResultVOUtil {
    //成功时返回
    public static ResultVO success(Object object){
        ResultVO resultVO = new ResultVO();
        resultVO.setData(object);
        resultVO.setCode(0);
        resultVO.setMsg("成功");
        return resultVO;
    }
    //什么都不传时返回
    public static ResultVO success(){
        return success(null);
    }
    //发生错误时返回
    public static ResultVO error(Integer code , String msg){
        ResultVO resultVO = new ResultVO();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
