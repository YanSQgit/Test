package org.example;

import java.io.Serializable;
import java.util.Arrays;

/**
 * @author yanshengqiang
 * @description 请求参数
 * @date 2020-03-18
 */
public class RpcRequest implements Serializable {
    private String className;
    private String methodName;
    private Object[] params;
    private Class[] type;

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String getMethodName() {
        return methodName;
    }

    public void setMethodName(String methodName) {
        this.methodName = methodName;
    }

    public Object[] getParams() {
        return params;
    }

    public void setParams(Object[] params) {
        this.params = params;
    }

    public Class[] getType() {
        return type;
    }

    public void setType(Class[] type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "RpcRequest{" +
                "className='" + className + '\'' +
                ", methodName='" + methodName + '\'' +
                ", params=" + Arrays.toString(params) +
                ", type=" + Arrays.toString(type) +
                '}';
    }
}
