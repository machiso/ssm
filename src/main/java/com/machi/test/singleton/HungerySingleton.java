package com.machi.test.singleton;

//饿汉式单例
public class HungerySingleton {
    private HungerySingleton(){};
    private static HungerySingleton singleton = new HungerySingleton();
    public static HungerySingleton getInstance(){
        return singleton;
    }
}
