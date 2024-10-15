package org.example.creational;

public class SingletonBreakerMechanism implements Runnable{
    @Override
    public void run() {
        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();
        System.out.println("Hashcode :"+singletonDesignPattern.hashCode());
    }
}
