/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFile;

import OpenFile.ReadConfig;
import java.io.PrintWriter;

/**
 *
 * @author PC1
 */
public class FileWriterOutput {
    
    public void writeFileOut(Integer[]a, int n) {
        java.io.FileWriter outFile;
        PrintWriter out;
        ReadConfig read;
        try {
            read = new ReadConfig();
            outFile = new java.io.FileWriter(read.getUrlOutput());
            out = new PrintWriter(outFile);
            for (int i = 0; i < n; i++) {
                out.println(a[i]);
            }
            out.close();
        } catch (Exception e) {
        }
    }
}
