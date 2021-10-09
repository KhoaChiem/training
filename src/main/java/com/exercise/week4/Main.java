package com.exercise.week4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    Statement statement;

    public static void main(String[] args){

        String[] filePaths = {"F:\\0101_saoke_t7.csv", "F:\\0101_saoke_t8.csv"};
        for (int i = 0; i < filePaths.length; i++) {
            CSVData csvData = new CSVData(filePaths[0]);
            csvData.readFile();
            List<List<String>> save = csvData.convertDataToListString();


            Statement statementWithCsvData = new Statement(save);
            statementWithCsvData.calculateCR();
            List<Long> moneyIn = statementWithCsvData.getSumIn();
            List<Long> moneyOut = statementWithCsvData.getSumOut();
            List<String> showList = statementWithCsvData.getIsDisplayed();
            for (int j = 0; j < showList.size(); j++) {
                System.out.println(moneyIn.get(j) + "\n");
                System.out.println(moneyOut.get(j) + "\n");
                System.out.println(showList.get(j));
            }
        }


//        ExcelData excelData = new ExcelData();
//        Statement settlementWithExcelData = new Statement(excelData);

//        settlementWithExcelData.calculateCR();

    }
}
