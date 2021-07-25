/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenFile;

import Interface.FileReaderIF;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author PC1
 */
public class BufferedReaderFile implements FileReaderIF {

    private List<Integer> a;

    @Override
    public List<Integer> openFile(String url) {
        FileInputStream file = null;
        BufferedReader in = null;
        try {
            ReadConfig read = new ReadConfig();
            a = new ArrayList<>();
            file = new FileInputStream(url);
            in = new BufferedReader(new InputStreamReader(file));
            String str = in.readLine();
            int i = 0;
            while (str != null) {
                a.add(Integer.parseInt(str));
                i++; 
                str = in.readLine();
            }

        } catch (Exception e) {
        }
        return a;
    }

}
