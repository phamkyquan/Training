/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OpenFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author PC1
 */
public class ShareArr {

//    private  partitions;
//
//    public ArrayList<List<Integer>> getPartitions() {
//        return partitions;
//    }

    public ArrayList<List<Integer>> share() throws IOException {
        BufferedReaderFile file = new BufferedReaderFile();
        ReadConfig read = new ReadConfig();
        List<Integer> originalList = file.openFile(read.getUrlInput());
        int partitionSize = read.getArrsize() / read.getN() + 1;
        ArrayList<List<Integer>> partitions = new ArrayList<List<Integer>>();
        for (int i = 0; i < originalList.size(); i += partitionSize) {
            Collections.sort(originalList.subList(i, Math.min(i + partitionSize, originalList.size())));
            partitions.add(originalList.subList(i, Math.min(i + partitionSize, originalList.size())));
        }
        return partitions;
    }

    public List<Integer> merge(List<Integer> a, List<Integer> b) throws IOException {
        List<Integer> c = new ArrayList<Integer>();
        int i = 0, j = 0;
        while (i < a.size() && j < b.size()) {
            if (a.get(i) <= b.get(j)) {
                c.add(a.get(i));
                i++;
            } else {
                c.add(b.get(j));
                j++;
            }
        }

        while (i < a.size()) {
            c.add(a.get(i));
            i++;
        }

        // Sao chép các phần tử còn lại của R[] nếu có
        while (j < b.size()) {
            c.add(b.get(j));
            j++;
        }
        return c;

    }

    public void getTime() throws IOException {
        ReadConfig read = new ReadConfig();
        long startTime = System.currentTimeMillis();
        ArrayList<List<Integer>> a = share();
        while (a.size()!=1) {
            a.add(merge(a.get(0), a.get(1)));
            a.remove(0);
            a.remove(1);
        }
        long endTime = System.currentTimeMillis();
        System.out.printf(read.getArrsize()+" elements  => "+(endTime - startTime)+" ms \n");
    }
}
