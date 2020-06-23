package com.machi.test.singleton;

//double check 模式，懒汉式写法
// 1、私有化构造函数
//2、静态变量，静态方法
public class DoubleCheckLazySingleton {
    private static DoubleCheckLazySingleton singleton;
    private DoubleCheckLazySingleton(){};
    public static  DoubleCheckLazySingleton getInstance(){
        if (singleton == null){
            synchronized (DoubleCheckLazySingleton.class){
                if (singleton == null){
                    singleton = new DoubleCheckLazySingleton();
                }
            }
        }
        return singleton;
    }
}
