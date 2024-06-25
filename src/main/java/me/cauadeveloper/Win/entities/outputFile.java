package me.cauadeveloper.Win.entities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import static me.cauadeveloper.Win.entities.inputFile.inputStr;

public class outputFile {

    public static void outputStr(){

        try (BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("C:\\Dev\\AplicationFiles\\outStr.txt"))){

            ArrayList<Character> list = new ArrayList<>();
            String win = inputStr();
            int count = win.length()-1;

            while (count >= 0){
                list.add(win.charAt(count));
                count--;
            }
            int size = list.size();
            for (int i = 0, j = size - 1 ; i < j; i++){
                list.add(i, list.remove(j));
            }

            Character[] arr = new Character[list.size()];

            for (int i = 0; i <= list.size() - 1; i++){
                arr[i] = list.get(i);
                System.out.print(arr[i]);
                bf.write(arr[i]);
            }
            System.out.println("\nwriting success");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void outputReader(){

        try (BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Dev\\AplicationFiles"))){



        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
