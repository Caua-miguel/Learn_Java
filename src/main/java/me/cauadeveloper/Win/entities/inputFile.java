package me.cauadeveloper.Win.entities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class inputFile {

    public static String inputStr(){

        try(BufferedInputStream bf = new BufferedInputStream(new FileInputStream("C:\\Dev\\AplicationFiles\\inpStr.txt"))){

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

    public static void inputRead(){

        try(BufferedReader bf = new BufferedReader(new FileReader("C:\\Dev\\AplicationFiles\\inpStr.txt"))){

            String txt = bf.readLine();

            while (txt != null){
                System.out.println(txt);
                txt = bf.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
