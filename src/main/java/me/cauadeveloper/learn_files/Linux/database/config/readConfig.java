package me.cauadeveloper.learn_files.Linux.database.config;

import static me.cauadeveloper.learn_files.Linux.Entities.AppInputFile.printReader;

public class readConfig {

    public static String[] readLines(){

        StringBuilder txt = printReader();
        String data = String.valueOf(txt);

        String[] arr = data.split("\n");
        return arr;

    }

}
