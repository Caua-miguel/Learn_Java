package me.cauadeveloper.Linux.Entities;

import java.io.*;

public class AppInputReader {

    public static void printReader(){
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/inptStr"))){

            String txt = reader.readLine();

            while (txt != null){
                System.out.println(txt);
                txt = reader.readLine();
            }

        }catch (
                IOException e){
            e.printStackTrace();
        }
    }

}
