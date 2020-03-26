package com.learn.observer2;

import java.util.Observable;
//java提供了 主题对象
public class ConcreteSubject extends Observable {

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    private int state;

    public void set(int s){
        state = s; //目标对象的状态发生了变化

        setChanged();//表示目标对象已经做了更改
        notifyObservers(state);//通知所有的观察者
    }


}
