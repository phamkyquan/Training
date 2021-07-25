/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package producerandconsumer;

/**
 *
 * @author PC1
 */
public class test {
    public static void main(String[] args) throws InterruptedException {
        MessageQueue<String> queue = new MessageQueue<>();
 
        Producer producer = new Producer(queue);
        Consumer consumer1 = new Consumer(queue);
        Consumer consumer2 = new Consumer(queue);
        Consumer consumer3 = new Consumer(queue);
       
 
        producer.start();
        consumer1.start();
        consumer2.start();
        consumer3.start();
         
        Thread.sleep(5000); // After 5s have another comsumer
        Consumer consumer4 = new Consumer(queue);
        consumer4.start();
    }
}
