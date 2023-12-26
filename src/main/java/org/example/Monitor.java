package org.example;

public class Monitor {
    private boolean ready = false;

    synchronized public void provide() {
        if (ready)
            return;
        ready = true;
        System.out.println("provide");
        notify();
    }

    synchronized public void consume() throws InterruptedException {
        while (!ready)
            wait();
        ready = false;
        System.out.println("consume");
    }
}
