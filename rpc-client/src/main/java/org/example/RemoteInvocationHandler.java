package org.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author yanshengqiang
 * @description
 * @date 2020-03-20
 */
public class RemoteInvocationHandler implements InvocationHandler {
    private String host;
    private int port;

    public RemoteInvocationHandler(String host, int port) {
        this.host = host;
        this.port = port;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        RpcRequest rpcRequest = new RpcRequest();
        rpcRequest.setClassName(method.getDeclaringClass().getName());
        rpcRequest.setMethodName(method.getName());
        rpcRequest.setParams(args);
        rpcRequest.setType(method.getParameterTypes());

        //建立网路通讯细节
        RpcNetTransport transport = new RpcNetTransport(port,host);
        Object result = transport.send(rpcRequest);
        return result;
    }
}
