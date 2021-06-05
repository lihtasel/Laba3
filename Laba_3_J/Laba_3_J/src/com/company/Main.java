package com.company;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;

public abstract class Main implements KeyListener{

    public static void main(String[] args) throws IOException, InterruptedException {
        Store store = new Store();
        Producer producer1 = new Producer(store);
        Producer producer2 = new Producer(store);
        Producer producer3 = new Producer(store);
        Consumer consumer1 = new Consumer(store);
        Consumer consumer2 = new Consumer(store);
        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
