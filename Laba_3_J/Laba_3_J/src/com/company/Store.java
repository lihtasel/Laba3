package com.company;

public class Store {
    private int counter = 200;

    public synchronized void get() {
        while (counter < 1) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        counter--;
        System.out.println("-1 : товар забрали");
        System.out.println(
                "\tколичество товара на складе : " + counter);
        notify();
    }

    public synchronized void put() {
        while (counter >= 100) {
            try {
                wait();
            } catch (InterruptedException e) {
            }
        }
        while (counter <= 80) {
            counter++;
            System.out.println("+1 : товар добавили");
            System.out.println(
                    "\tколичество товара на складе : " + counter);
            notify();
        }
    }
}