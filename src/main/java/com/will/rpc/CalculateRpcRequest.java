package com.will.rpc;

import java.io.Serializable;

public class CalculateRpcRequest implements Serializable {
    int a;
    int b;

    public CalculateRpcRequest(int a,int b){
        this.a=a;
        this.b=b;
    }
    public String getMethod(){
        return "add";
    }
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }
}
