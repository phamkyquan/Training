/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC1
 */
public class ThreadA extends Thread {

    private ReadFile file;

    public ThreadA(ReadFile file) {
        this.file = file;
    }

    @Override
    public void run() {
        synchronized(file){
            try {
                file.wait();
                file.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadA.class.getName()).log(Level.SEVERE, null, ex);
            }
            if(file.getStatus()==0){
                System.out.println("Không tìm thấy!");
            }
            else System.out.println("Đã tìm thấy!");
            file.notifyAll();
        }
    }

}
