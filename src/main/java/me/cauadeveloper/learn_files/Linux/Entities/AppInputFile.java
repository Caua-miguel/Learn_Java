package me.cauadeveloper.learn_files.Linux.Entities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppInputFile {

    public static  String printStr(){
        try (InputStream inputStream = new BufferedInputStream(new FileInputStream("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/inptStr"))){

            ArrayList<Byte> list = new ArrayList<>();
            int data = inputStream.read();

            while (data != -1){
                list.add((byte)data);
                data = inputStream.read();
            }

            byte[] arr = new byte[list.size()];

            for (int i = 0; i < list.size(); i++){
                arr[i] = list.get(i);
            }
            return new String(arr, StandardCharsets.UTF_8);
        }catch (
                IOException e){
            e.printStackTrace();
        }
        return null;
    }


    public static void printReader(){
        try (BufferedReader reader = new BufferedReader(new FileReader("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/inptStr"))){

            ArrayList<String> list = new ArrayList<>();
            String txt = reader.readLine();

            while (txt != null){
                list.add(txt);
                System.out.println(list.get(list.size()-1));
                txt = reader.readLine();
            }

        }catch (
                IOException e){
            e.printStackTrace();
        }
    }

}
