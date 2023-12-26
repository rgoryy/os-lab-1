package org.example;

public class ConsumerThread extends Thread{
    private final Monitor monitor;
    public ConsumerThread(Monitor monitor) {
        this.monitor = monitor;
    }

    @Override
    public void run() {
        while (true) {
            try {
                monitor.consume();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
