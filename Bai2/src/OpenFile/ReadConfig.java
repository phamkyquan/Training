/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author PC1
 */
public class ReadConfig {

    private int n, arrsize;
    private String urlInput, urlOutput;

    public ReadConfig() throws FileNotFoundException, IOException {
        Properties pro = new Properties();
        pro.load(new FileInputStream("D:\\Bai2\\src\\OpenFile\\config.properties"));
        arrsize = Integer.parseInt(pro.getProperty("ARRSIZE"));
        n = Integer.parseInt(pro.getProperty("N"));
        urlInput = pro.getProperty("URLINPUT");
        urlOutput = pro.getProperty("URLOUTPUT");
    }

    public String getUrlInput() {
        return urlInput;
    }

    public String getUrlOutput() {
        return urlOutput;
    }

    public int getN() {
        return n;
    }

    public int getArrsize() {
        return arrsize;
    }

}
