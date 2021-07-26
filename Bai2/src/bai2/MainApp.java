/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

import OpenFile.ShareArr;
import WriteFile.FileWriterInput;
import java.io.IOException;

/**
 *
 * @author PC1
 */
public class MainApp {

    public static void main(String[] args) throws IOException {
        FileWriterInput file  = new FileWriterInput();
        file.writeFileInput();
        ShareArr arr = new ShareArr();
        arr.getTime();
    }
}
