/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author PC1
 */
public class ThreadB extends Thread {

    private ReadFile file;

    public ThreadB(ReadFile file) {
        this.file = file;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException ex) {
        }
        synchronized (file) {
            ArrayList<Integer> out = file.getA();
            Collections.sort(out);
            file.setA(out);
            System.out.println("File input.txt sau khi sắp xếp là:");
            for (Integer integer : out) {
                System.out.println(integer);
            }
            file.notifyAll();
        }
    }
}
