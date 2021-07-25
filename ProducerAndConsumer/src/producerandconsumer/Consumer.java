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
public class Consumer extends Thread {

    private final MessageQueue<String> queue;

    Consumer(MessageQueue<String> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        try {
            while (true) {
                queue.take();
                System.out.println("Đã lấy message ra khỏi Queue - Queue size() = " + queue.size());
                Thread.sleep(ThreadLocalRandom.current().nextInt(50, 300)); // simulate time passing
            }
        } catch (InterruptedException e) {
        }
    }

}
