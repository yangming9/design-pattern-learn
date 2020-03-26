package com.learn.chainofresponsibility;

public class Client {
    public static void main(String[] args){
        Leader a = new Director("zhangsan");
        Leader b = new Manager("lisi");
        Leader c = new GeneralManager("wangwu");

        //组织责任链对象的关系

        a.setNextLeader(b);
        b.setNextLeader(c);

        //开始请假操作
        LeaveRequest lr = new LeaveRequest("Tom",40,"回家探亲");
        a.handleRequest(lr);
    }
}
