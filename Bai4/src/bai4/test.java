/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

/**
 *
 * @author PC1
 */
public class test {
    public static void main(String[] args) {
        ReadFile r = new ReadFile();
        ThreadB b = new ThreadB(r);
        ThreadC c = new ThreadC(r);
        ThreadA a = new ThreadA(r);
        a.start();
        b.start();
        c.start();
    }
}
