package org.amm.dp.budai.creational.singleton;

public class Singleton {
    
    public static class SingletonHolder {
        public static final Singleton HOLDER_INSTANCE = new Singleton();
    }
        
    public static Singleton getInstance() {
        return SingletonHolder.HOLDER_INSTANCE;
    }
}