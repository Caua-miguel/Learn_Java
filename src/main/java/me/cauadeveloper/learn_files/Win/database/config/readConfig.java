package me.cauadeveloper.learn_files.Win.database.config;

import me.cauadeveloper.learn_files.Win.entities.inputFile;

public class readConfig {

    public static String[] readLines(){

        StringBuilder txt = inputFile.inputRead();
        String data = String.valueOf(txt);

        String[] arr = data.split("\n");
        return arr;


    }

}
