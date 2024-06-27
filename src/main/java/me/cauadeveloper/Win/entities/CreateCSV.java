package me.cauadeveloper.Win.entities;

import java.io.File;
import java.io.IOException;

public class CreateCSV {

    public static File newCSV(){

        try{
            File folder = new File("C:\\Dev\\AplicationFiles\\out");
            File file = new File(folder + "\\data.csv");

            if(!folder.exists()){
                folder.mkdir();
            }
            if(!file.exists()){
                file.createNewFile();
            }

            return file;

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("new file created");

        return null;
    }

}
