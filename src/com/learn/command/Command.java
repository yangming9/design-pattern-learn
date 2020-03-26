package com.learn.command;

public interface Command {
    /**
     * 这是一个返回结果为空的方法
     * 实际项目中，可以根据需求设计多个不同的方法
     */
    void execute();
}
