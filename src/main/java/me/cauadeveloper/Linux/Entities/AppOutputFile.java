package me.cauadeveloper.Linux.Entities;

import java.io.*;
import java.util.ArrayList;

import static me.cauadeveloper.Linux.Entities.AppInputFile.printStr;

public class AppOutputFile {

    public static void outputStr(){

        try (BufferedOutputStream bf = new BufferedOutputStream(new FileOutputStream("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/outptStr"))){

            ArrayList<Character> list = new ArrayList<>();
            String lin = printStr();
            int count = lin.length()-1;
            int i = 0;

            // Duas formas de fazer a mesma coisa, mas o for é mais verboso, portanto, vou deixar ele aqui.

//            for ( i = 0; i <= count; i++){
//                list.add(win.charAt(i));
//                System.out.print(list.get(i));
//                bf.write(list.get(i));
//            }

            while (i <= count){
                list.add(lin.charAt(i));
                System.out.print(list.get(i));
                bf.write(list.get(i));
                i++;
            }

            System.out.println("\nwriting success");

        }catch (IOException e){
            e.printStackTrace();
        }

    }

    public static void outputWriter(){

        try (BufferedWriter bf = new BufferedWriter(new FileWriter("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/"))){

        String lin = printStr();


        }catch (IOException e) {
            e.printStackTrace();
        }

    }

}
