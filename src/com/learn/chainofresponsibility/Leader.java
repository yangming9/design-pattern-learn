package com.learn.chainofresponsibility;

public abstract class Leader {

    protected String name;
    protected Leader nextLeader;//责任链上的后继对象

    public Leader(String name) {
        super();
        this.name = name;
    }

    //设定责任链上的后继对象
    public void setNextLeader(Leader nextLeader) {
        this.nextLeader = nextLeader;
    }

    /**
     * 处理业务请求的核心方法
     * @param leaveRequest
     */
    public abstract void handleRequest(LeaveRequest leaveRequest);
}
