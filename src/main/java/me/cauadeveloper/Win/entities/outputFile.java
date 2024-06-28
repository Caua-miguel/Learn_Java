package me.cauadeveloper.Win.entities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

import static me.cauadeveloper.Win.entities.CreateCSV.newCSV;
import static me.cauadeveloper.Win.entities.inputFile.inputRead;
import static me.cauadeveloper.Win.entities.inputFile.inputStr;

public class outputFile {

    public static void outputStr(){

        try (BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("C:\\Dev\\AplicationFiles\\outStr.txt"))){

            String win = inputStr();
            bf.write(win.getBytes());

//              ArrayList<Character> list = new ArrayList<>();
//            int count = win.length()-1;
//
//            // Usando while e revertendo as posições do array
//            while (count >= 0){
//                list.add(win.charAt(count));
//                count--;
//            }
//
//            int size = list.size();
//            for (int i = 0, j = size - 1 ; i <= j; i++){
//                list.add(i, list.remove(j));
//                System.out.print(list.get(i));
//                bf.write(list.get(i));
//            }

            System.out.println("\nwriting success");
        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void outputWriter(){

//        File newCSV = newCSV();

        try (BufferedWriter bf = new BufferedWriter(new FileWriter("C:\\Users\\caua.rocha\\IdeaProjects\\File_Aplication\\src\\main\\java\\me\\cauadeveloper\\Win\\database\\data\\data.db"))){

            StringBuilder txt = inputRead();

            bf.write(String.valueOf(txt));
            System.out.println("StringBuilde Success");


        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
