package com.exercise.week4;

import com.opencsv.CSVReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CSVData extends Data {
    //properties for Excel class??
    private String srcFilePath;
    private String  file;
//    private List<List<String>> records;
    private List<String[]> data;
    public CSVData (String file) {
        this.file = file;
        this.data = new ArrayList<>();
    }

    @Override
    public void readFile() {
        // logic to read csv file
            try (CSVReader reader = new CSVReader(new FileReader(file))) {
                 this.data = reader.readAll();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

    }

    public List<List<String>> convertDataToListString(){
        List<List<String>> records = new ArrayList<>();
        for (int i = 0; i < data.size(); i++) {
            List<String> temp = Arrays.asList(data.get(i));
            records.add(temp);
        }
        return records;
    }



    public void writeFile(String srcFilePath, List<List<String>> content){
        // logic to read csv file
    }
}
