package com.machi.test.singleton;


//懒汉式
public class LazySingletonObject {
    private static LazySingletonObject lazySingletonObject;
    private LazySingletonObject(){};
    public static LazySingletonObject getSingleton(){
        if (lazySingletonObject == null){
            lazySingletonObject = new LazySingletonObject();
        }
        return lazySingletonObject;
    }
}
