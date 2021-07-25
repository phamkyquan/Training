/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author PC1
 */
public class ThreadC extends Thread {

    private ReadFile file;

    public ThreadC(ReadFile file) {
        this.file = file;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException ex) {
        }
        synchronized (file) {
            try {
                file.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(ThreadC.class.getName()).log(Level.SEVERE, null, ex);
            }
            ArrayList<Integer> search = file.openFile("D:\\search.txt");
            int z = 0;
            int s = search.get(z);
            for (int j = 0; j < file.getA().size(); j++) {
                int dem = 0;
                if (file.getA().get(j) == s) {
                    int n = search.size() - 1;
                    while (n != 0) {
                        j++;
                        z++;
                        if (file.getA().get(j) == (int) search.get(z)) {
                            dem++;
                        }
                        n--;
                    }
                }
                if (dem + 1 == search.size()) {
                    file.setStatus(1);
                }
            }
            file.notifyAll();
        }
    }
}
