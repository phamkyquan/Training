/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WriteFile;

import Interface.FileWriterIF;
import OpenFile.ReadConfig;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/**
 *
 * @author PC1
 */
public class FileWriterInput implements FileWriterIF {

    @Override
    public void writeFileInput() {
        ReadConfig read;
        FileWriter outFile;
        PrintWriter out;
        try {
            read = new ReadConfig();
            outFile = new FileWriter(read.getUrlInput());
            out = new PrintWriter(outFile);
            Random r = new Random();
            for (int i = 0; i < read.getArrsize(); i++) {
                int a = r.nextInt(read.getArrsize());
                out.println(a);
            }
            out.close();
        } catch (Exception e) {
        }
    }

}
