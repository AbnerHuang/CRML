package com.antlr.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class FileProcess {
    public static String fileToString(File file){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(new FileInputStream(file));
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String curLine;
            while ((curLine = bufferedReader.readLine()) != null) {
                stringBuilder.append(curLine);
                stringBuilder.append("\n");
            }
        }catch (Exception exception){
            exception.printStackTrace();
        }
        return stringBuilder.toString();
    }
}
