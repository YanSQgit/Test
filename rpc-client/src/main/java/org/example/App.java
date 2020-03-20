package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        RpcProxyClient rpcProxyClient = new RpcProxyClient();
        ISayHelloService sayHelloService = rpcProxyClient.clientProxy(ISayHelloService.class,"localhost",8080);
        System.out.println(sayHelloService.sayHello("How are you"));
    }
}
