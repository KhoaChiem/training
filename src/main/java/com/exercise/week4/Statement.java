package com.exercise.week4;

import java.util.ArrayList;
import java.util.List;

public class Statement {
    public List<Long> getSumIn() {
        return sumIn;
    }

    public List<Long> getSumOut() {
        return sumOut;
    }

    public List<String> getIsDisplayed() {
        return isDisplayed;
    }

    // properties for Settlement?
    private List<String> column1 = new ArrayList<String>();
    private List<String> column2 = new ArrayList<String>();
    private List<String> column3 = new ArrayList<String>();
    //
    private List<Long> sumIn = new ArrayList<Long>();
    private List<Long> sumOut = new ArrayList<Long>();
    private List<String> isDisplayed = new ArrayList<String>();


    public Statement(List<List<String>> data) {
        for (List<String> row : data) {
            this.column1.add(row.get(2));
            this.column2.add(row.get(3));
            this.column3.add(row.get(5));
        }
    }


    public void calculateCR() {
        for (int i = 1; i < column3.size(); i++) {
            if (isDisplayed.contains(column3.get(i))) {
                int index = isDisplayed.indexOf(column3.get(i));
                this.sumIn.set(index, sumIn.get(index) + Long.parseLong(column1.get(i)));
                this.sumOut.set(index, sumOut.get(index) + Long.parseLong(column2.get(i)));
            } else {
                this.isDisplayed.add(column3.get(i));
                int index1 = isDisplayed.indexOf(column3.get(i));
                this.sumIn.add(index1, Long.parseLong(column1.get(i)));
                this.sumOut.add(index1, Long.parseLong(column2.get(i)));
            }
        }
    }


}
