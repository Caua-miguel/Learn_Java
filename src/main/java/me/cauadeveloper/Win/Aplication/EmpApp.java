package me.cauadeveloper.Win.Aplication;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

public class EmpApp {

    public static void main(String[] args) throws IOException {

        try(InputStream inputStream = new FileInputStream("C:\\Dev\\AplicationFiles\\inpStr.txt");){

            ArrayList<Byte> list = new ArrayList<>();
            int data = inputStream.read();

                while (data != -1){
                    list.add((byte) data);
                    data = inputStream.read();
                }

            byte[] arr = new byte[list.size()];

                for (int i = 0; i < list.size(); i++){
                    arr[i] = list.get(i);
                }

            System.out.println(new String(arr, StandardCharsets.UTF_8));

        }catch (IOException e){
            e.printStackTrace();
        }

    }

}
