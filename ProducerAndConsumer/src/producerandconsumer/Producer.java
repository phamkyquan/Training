/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerandconsumer;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author PC1
 */
public class Producer extends Thread {
    private final MessageQueue<String> queue;
 
    Producer(MessageQueue<String> queue) {
        this.queue = queue;
    }
 
    @Override
    public void run() {
        try {
            while (true) {
                queue.put(produce());
                System.out.println("Đã thêm message vào Queue - Queue size() = "  + queue.size());
            }
        } catch (InterruptedException e) {
        }
    }
 
    private String produce() throws InterruptedException {
        Thread.sleep(50); // simulate time to produce the data
        return "Message";
    }
}
