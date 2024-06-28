package me.cauadeveloper.Win.database.config;

import java.util.ArrayList;
import java.util.Arrays;

import static me.cauadeveloper.Win.entities.inputFile.inputRead;

public class readConfig {

    public static String[] readLines(){

        StringBuilder txt = inputRead();
        String data = String.valueOf(txt);

        String[] arr = data.split("\n");
        return arr;


    }

}
