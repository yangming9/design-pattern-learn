package com.learn.adapter;


/**
 * 客户端类
 * 相当于笔记本，只有USB接口
 */
public class Client {

    public void test1(Target t) {
        t.handleReq();
    }

    public static void main(String[] args) {
        Client c = new Client();
        Adaptee adaptee = new Adaptee();
//        Target t = new Adapter();
        Target t = new Adapter2(adaptee);
        c.test1(t);
    }
}
