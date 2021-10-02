package com.exercise.week3;

import com.opencsv.CSVReader;

import java.io.*;
import java.util.*;


public class Statement {
    public static void main(String[] args) throws IOException {
        String file1 = "F:\\0101_saoke_t7.csv";
        String file2 = "F:\\0101_saoke_t8.csv";
        List<String> fileName = new ArrayList<>();
        fileName.add(file1);
        fileName.add(file2);
        for (String file : fileName) {
            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                List<String[]> r = reader.readAll();
                List<List<String>> records = new ArrayList<>();
                for (int i = 0; i < r.size(); i++) {
                    List<String> temp = Arrays.asList(r.get(i));
                    records.add(temp);
                }
//            for (List<String> index : records) {
//                for (String x : index) {
//                    System.out.printf(x);
//                }
//                System.out.println();
//            }
                List<String> column1 = new ArrayList<String>();
                List<String> column2 = new ArrayList<String>();
                List<String> column3 = new ArrayList<String>();
                for (List<String> row : records) {
                    column1.add(row.get(2));
                    column2.add(row.get(3));
                    column3.add(row.get(5));
                }


                List<Long> sumIn = new ArrayList<Long>();
                List<Long> sumOut = new ArrayList<Long>();
                List<String> isDisplayed = new ArrayList<String>();

                for (int i = 1; i < column3.size(); i++) {
                    if (isDisplayed.contains(column3.get(i))) {
                        int index = isDisplayed.indexOf(column3.get(i));
                        sumIn.set(index, sumIn.get(index) + Long.parseLong(column1.get(i)));
                        sumOut.set(index, sumOut.get(index) + Long.parseLong(column2.get(i)));
                    } else {
                        isDisplayed.add(column3.get(i));
                        int index1 = isDisplayed.indexOf(column3.get(i));
                        sumIn.add(index1, Long.parseLong(column1.get(i)));
                        sumOut.add(index1, Long.parseLong(column2.get(i)));
                    }
                }

                for (int i = 0; i < isDisplayed.size(); i++) {
                    System.out.print(isDisplayed.get(i) + "--->");
                    System.out.print("\t" + "Cash in: " + sumIn.get(i));
                    System.out.print("\t" + "Cash out: " + sumOut.get(i) + "\n");
                }
            }
            System.out.println("---------" + "\n");
        }
    }
}