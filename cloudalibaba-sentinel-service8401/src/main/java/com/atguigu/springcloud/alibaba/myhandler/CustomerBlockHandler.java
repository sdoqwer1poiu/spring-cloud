package com.atguigu.springcloud.alibaba.myhandler;

import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.atguigu.springcloud.entities.CommonResult;

/**
 * @ClassName CustomerBlockHandler
 * @Description TODO
 * @Author YH
 * @Date 2020/10/14 15:46
 * @Version 1.0
 */
public class CustomerBlockHandler {
    public static CommonResult handleException(BlockException exception) {
        return new CommonResult(2020, "自定义限流处理信息....CustomerBlockHandler");

    }
    public static CommonResult handleException2(BlockException exception) {
        return new CommonResult(4444, "全局异常限流处理信息....CustomerBlockHandler");

    }

}
