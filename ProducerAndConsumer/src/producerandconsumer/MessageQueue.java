/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerandconsumer;

import java.util.LinkedList;

/**
 *
 * @author PC1
 * @param <T>
 */
public class MessageQueue<T> {

    private static final int compacity = 10;
    private final LinkedList<T> items = new LinkedList<>();

    public synchronized void put(T message) throws InterruptedException {
        while (items.size() == compacity) {
            System.out.println("Queue is full");
            wait();
        }
        items.addLast(message);
        notifyAll();
    }

    public synchronized void take() throws InterruptedException {
        while (items.isEmpty()) {
            wait();
            System.out.println("Queue is empty! Waiting...................................");

        }
        notifyAll();
        System.out.println(items.removeFirst());
    }

    public synchronized int size() {
        return items.size();
    }
}
