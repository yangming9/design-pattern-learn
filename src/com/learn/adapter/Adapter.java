package com.learn.adapter;

/**
 * 适配器(类适配器方式)
 * 相当于转接器
 */
public class Adapter extends Adaptee implements Target {

    @Override
    public void handleReq() {
        super.request();
    }
}
