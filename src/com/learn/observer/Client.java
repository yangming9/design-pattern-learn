package com.learn.observer;

public class Client {
    public static void main(String[] args){

        ConreteSubject subject = new ConreteSubject();

        Observer obs1 = new ObserverA();
        Observer obs2 = new ObserverA();
        Observer obs3 = new ObserverA();

        //将对象加入广播的主题队伍中
        subject.registerObserver(obs1);
        subject.registerObserver(obs2);
        subject.registerObserver(obs3);

        subject.setState(30);
        System.out.println("*********");
        System.out.println(((ObserverA) obs1).getMyState());
        System.out.println(((ObserverA) obs2).getMyState());
        System.out.println(((ObserverA) obs3).getMyState());
    }
}
