package org.example.creational;

public final class SingletonDesignPattern {

    public static volatile SingletonDesignPattern singletonDesignPattern ;

    private  SingletonDesignPattern(){
        System.out.println("Instance created");
    }

    public static  SingletonDesignPattern getInstance(){

        if (singletonDesignPattern == null) {  // First check (no locking)
            try {
                // Simulate some delay to increase the chances of a race condition

                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            //Double - checked locking mechanism to reduce synchronous locking overhead
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) { // Second check (with locking)
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }


        return singletonDesignPattern;
    }
}
