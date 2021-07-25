/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Thread;

import OpenFile.ShareArr;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PC1
 */
public class MyThread extends Thread {

    ShareArr arr;

    public MyThread(List<Integer> a) {
        this.a = a;
    }

    @Override
    public void run() {
        synchronized (a) {
            
        }
    }
}
