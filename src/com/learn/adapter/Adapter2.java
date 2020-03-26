package com.learn.adapter;

/**
 * 适配器(对象适配器方式，使用了组合的方式跟适配器对象整合)
 * 相当于转接器
 */
public class Adapter2 implements Target {

    private Adaptee adaptee;

    public Adapter2(Adaptee adaptee) {
        super();
        this.adaptee = adaptee;
    }

    @Override
    public void handleReq() {
        adaptee.request();
    }
}
