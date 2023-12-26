package org.example;

public class ProviderThread extends Thread{
    private final Monitor monitor;
    public ProviderThread(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(1000);
                monitor.provide();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
