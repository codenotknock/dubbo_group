package org.xiaofu.filter;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.constants.CommonConstants;
import org.apache.dubbo.common.extension.Activate;
import org.apache.dubbo.rpc.Filter;
import org.apache.dubbo.rpc.Invocation;
import org.apache.dubbo.rpc.Invoker;
import org.apache.dubbo.rpc.Result;
import org.apache.dubbo.rpc.RpcException;

/**
 * @author xiaofu
 * @date 2024/08/27
 * @program dubbo_group
 * @description dubbo 自定义过滤器示例
 **/
// filter生效设置： @Activate注解设置 或者 @DubboService(filter = "filterKey")
@Activate(group = CommonConstants.PROVIDER)
public class MyProviderFilter implements Filter {

    /**
     * 过滤器添加的功能写在 invoke 方法中
     * @param invoker 实际 dubbo rpc 的调用
     * @param invocation 调用过程中对应的一些参数
     * @return
     * @throws RpcException
     */
    @Override
    public Result invoke(Invoker<?> invoker, Invocation invocation) throws RpcException {
        URL url = invoker.getUrl();
        System.out.println("url:" + url.toFullString());
        String methodName = invocation.getMethodName();
//        String serviceName = invocation.getServiceName();
        String serviceName = invocation.getServiceModel().getServiceName();
        System.out.println("MyProviderFilter.invoke... : " + serviceName + " " + methodName);

        // 后续操作及其结果: 如果过滤代码在此行上面会在调用rpc前运行，在下面会在调用rpc之后
        Result invoke = invoker.invoke(invocation);


        return invoke;
    }
}
