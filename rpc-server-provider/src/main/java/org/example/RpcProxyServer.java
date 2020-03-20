package org.example;

import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author yanshengqiang
 * @description
 * @date 2020-03-18
 */
public class RpcProxyServer {

    public void publisher(Object service,int port) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        ServerSocket serverSocket = null;
        try {
            //监听指定端口
            serverSocket = new ServerSocket(port);
            while (true) {
                //服务端执行到此处说明有客户端连接过来
                Socket socket = serverSocket.accept();
                executorService.submit(new ProcessorHandler(socket,service));
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
