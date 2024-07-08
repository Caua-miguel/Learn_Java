package me.cauadeveloper.learn_files.Win.database.config;

import static me.cauadeveloper.learn_files.Win.Entities.inputFile.inputRead;

public class readConfig {

    public static String[] readLines(){

        StringBuilder txt = inputRead();
        String data = String.valueOf(txt);

        String[] arr = data.split("\n");
        return arr;


    }

}
