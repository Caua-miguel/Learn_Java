package me.cauadeveloper.Win.database.config;

import java.util.ArrayList;

import static me.cauadeveloper.Win.entities.inputFile.inputRead;

public class readConfig {

    // fazer um array list que receba os dados lidos do csv e retorne um String[] separado por linhas

    public static String[] readLines(){

        ArrayList<String> listLine = new ArrayList<>();
        StringBuilder txt = inputRead();
        String data = String.valueOf(txt);


        while (data != null){

        }
    // Usar o split para separar as linhas



        return null;
    }

}
