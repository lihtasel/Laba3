package com.company;

public class Producer implements Runnable
{
    Store store;
    Producer(Store store) {
        this.store=store;
    }
    @Override
    public void run() {
        while (true)
            store.put();
    }
}
