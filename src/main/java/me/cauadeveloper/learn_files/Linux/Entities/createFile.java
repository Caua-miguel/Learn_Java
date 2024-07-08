package me.cauadeveloper.Linux.Entities;

import java.io.File;
import java.io.IOException;

public class createFile {

    public static File createDataFile(){

        File file = new File("/home/caua/Documentos/Dev/Backend/LearnFolders/AplicationFiles/src/main/java/me/cauadeveloper/Linux/database/data/data.db");

        try{

            if(!file.exists()){
                file.createNewFile();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println("new data file created");

        return file;
    }


}
