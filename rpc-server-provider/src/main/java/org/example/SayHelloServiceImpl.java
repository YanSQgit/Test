package org.example;

/**
 * @author yanshengqiang
 * @description
 * @date 2020-03-18
 */
public class SayHelloServiceImpl implements ISayHelloService {
    @Override
    public String sayHello(String txt) {
        System.out.println("request data:-------------" + txt);
        return "Hi Boy ，" + txt;
    }
}
