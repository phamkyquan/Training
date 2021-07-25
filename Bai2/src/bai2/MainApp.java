/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import OpenFile.ReadConfig;
import OpenFile.ShareArr;
import Thread.MyThread;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC1
 */
public class MainApp {

    public static void main(String[] args) throws IOException, InterruptedException {
        ShareArr arr = new ShareArr();
//        List<Integer> A = new ArrayList<>();
        ReadConfig read = new ReadConfig();
//        for (int i = 0; i < read.getN(); i++) {
//            List<Integer> a = arr.share().get(i);
//            synchronized (a) {
//                new MyThread(a).start();
//                a.wait();
//                for (int j = 0; j < 100; j++) {
//                    System.out.println(arr.share().get(i).get(i));
//                }
//            }
//
//        }

//        synchronized (arr) {
//            new MyThread(arr.share().get(0)).start();
//            arr.wait();
//            for (int i = 0; i < arr.share().get(0).size(); i++) {
//                System.out.println(arr.share().get(0).get(i));
//            }
//        }

//        while(true){
//            int n = arr.share().size();
//            arr.share().add(arr.megre(arr.share().get(n+1), arr.share().get(n+2)));
//            if(arr.share().size()==1){
//                break;
//            }
//            arr.share().remove(0);
//            arr.share().remove(1);
//        }
        for (int i = 0; i < arr.share().size(); i++) {
            for (int j = 0; j < arr.share().get(i).size(); j++) {
                System.out.println(arr.share().get(i).get(j));
            }
    System.out.println("-------------------------------------------");
            
        }
        
//        List<List<Integer>> a = arr.share();
//        a.remove(0);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(a.get(3).get(i));
//        }
        System.out.println("done");
    }
}
