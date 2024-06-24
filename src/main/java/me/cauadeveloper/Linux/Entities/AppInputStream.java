package me.cauadeveloper.Linux.Entities;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class AppInputStream {

    public static void printStr(){
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
            System.out.println(new String(arr, StandardCharsets.UTF_8));
        }catch (
                IOException e){
            e.printStackTrace();
        }
    }


}
