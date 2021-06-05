package com.company;

public class Consumer implements Runnable
{
    Store store;
    Consumer(Store store) {
        this.store=store;
    }
    @Override
    public void run(){
        while(true)
            store.get();
    }
}
