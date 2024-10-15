package org.example;

import org.example.creational.SingletonBreakerMechanism;
import org.example.creational.SingletonDesignPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {

        SingletonDesignPattern singletonDesignPattern = SingletonDesignPattern.getInstance();
        System.out.println(singletonDesignPattern.hashCode());

       // SingletonDesignPattern singletonDesignPattern2 = SingletonDesignPattern.getInstance();
      //  System.out.println(singletonDesignPattern2.hashCode());

        Thread t1= new Thread(new SingletonBreakerMechanism());
        Thread t2= new Thread(new SingletonBreakerMechanism());
        Thread t3= new Thread(new SingletonBreakerMechanism());
       // t1.start();
       // t2.start();
       // t3.start();
        // breaking through reflection API
        Constructor<SingletonDesignPattern> constructor = SingletonDesignPattern.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        SingletonDesignPattern newInstance = constructor.newInstance();
        System.out.println(newInstance.hashCode());

    }
}