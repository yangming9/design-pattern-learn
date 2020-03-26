package com.learn.observer2;


public class Client {
    public static void main(String[] args) {

        ConcreteSubject subject = new ConcreteSubject();

        ObserverA obs1 = new ObserverA();
        ObserverA obs2 = new ObserverA();
        ObserverA obs3 = new ObserverA();

        //将对象加入广播的主题队伍中
        subject.addObserver(obs1);
        subject.addObserver(obs2);
        subject.addObserver(obs3);

        subject.set(330);
        System.out.println("*********");
        System.out.println(obs1.getMyState());
        System.out.println(obs2.getMyState());
        System.out.println(obs3.getMyState());
    }
}
