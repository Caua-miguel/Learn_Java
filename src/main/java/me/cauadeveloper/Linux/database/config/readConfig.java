package me.cauadeveloper.Linux.database.config;

import static me.cauadeveloper.Linux.Entities.AppInputFile.printReader;

public class readConfig {

    public static String[] readLines(){

        StringBuilder txt = printReader();
        String data = String.valueOf(txt);

        String[] arr = data.split("\n");
        return arr;

    }

}
