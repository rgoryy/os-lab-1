package org.example;

public class Main {
    public static void main(String[] args) {
        Monitor monitor = new Monitor();
        ConsumerThread consumerThread = new ConsumerThread(monitor);
        ProviderThread providerThread = new ProviderThread(monitor);

        providerThread.start();
        consumerThread.start();
    }
}