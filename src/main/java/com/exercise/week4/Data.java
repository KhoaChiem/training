package com.exercise.week4;

import java.util.List;

public abstract class Data {
    public abstract void readFile();
    public abstract List<List<String>> convertDataToListString();
    public abstract void writeFile(String srcFilePath, List<List<String>> content);
}
