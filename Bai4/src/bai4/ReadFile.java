/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author PC1
 */
public class ReadFile {
    private int status = 0;
    private ArrayList<Integer> a = new ArrayList<>();
    private ArrayList<Integer> a1 = new ArrayList<>();

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }
    
    public ArrayList<Integer> getA() {
        return a;
    }

    public void setA(ArrayList<Integer> a) {
        this.a = a;
    }

    public ReadFile() {
        FileInputStream file = null;
        BufferedReader in = null;
        try {
            file = new FileInputStream("D:\\input.txt");
            in = new BufferedReader(new InputStreamReader(file));
            String str = in.readLine();
            while (str != null) {
                a.add(Integer.parseInt(str));
                str = in.readLine();
            }

        } catch (Exception e) {
        }
    }
    public ArrayList<Integer> openFile(String url){
        FileInputStream file = null;
        BufferedReader in = null;
        try {
            file = new FileInputStream(url);
            in = new BufferedReader(new InputStreamReader(file));
            String str = in.readLine();
            while (str != null) {
                a1.add(Integer.parseInt(str));
                str = in.readLine();
            }

        } catch (Exception e) {
        }
        return a1;
    }
}
