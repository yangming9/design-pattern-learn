package com.learn.observer2;

import java.util.Observable;
import java.util.Observer;
//java提供了目标对象的接口
public class ObserverA implements Observer {

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }

    private int myState;

    @Override
    public void update(Observable o, Object arg) {
        myState = ((ConcreteSubject)o).getState();
    }


}
