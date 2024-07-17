package me.cauadeveloper.learn_files.Win.Entities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class inputFile {

    public static String inputStr(){

        try(BufferedInputStream bf = new BufferedInputStream(new FileInputStream("C:\\Dev\\AplicationFiles\\data.csv"))){

            ArrayList<Byte> list = new ArrayList<>();
            int data = bf.read();

            while (data != -1){
                list.add((byte) data);
                data = bf.read();
            }

            byte[] arr = new byte[list.size()];

            for (int i = 0; i < list.size(); i++){
                arr[i] = list.get(i);
            }

            return new String(arr, StandardCharsets.UTF_8);

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

    public static StringBuilder inputRead(){

        // preciso retornar um array, com as três colunas, vai ser os três métodos do bot.
        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Dev\\AplicationFiles\\data.csv"))){

            StringBuilder text = new StringBuilder();
            String txt = bf.readLine();

            while (txt != null){
                text.append(txt);
                text.append("\n");
                txt = bf.readLine();
            }

            return text;

        }catch (IOException e){
            e.printStackTrace();
        }
        return null;
    }

}
