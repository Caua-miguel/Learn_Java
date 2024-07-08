package me.cauadeveloper.learn_files.Linux.Entities;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;

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


    public static StringBuilder printReader(){

        StringBuilder text = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/grupos.xls"))){

            String txt = reader.readLine();

            while (txt != null){
                text.append(txt);
                text.append("\n");
                txt = reader.readLine();
            }

        }catch (
                IOException e){
            e.printStackTrace();
        }
        System.out.println(text);
        return text;
    }

    public static ArrayList<String> readFileUserCollumnE(){

        ArrayList<String> list = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/grupos.xls"))){

            String line = bf.readLine();
            bf.readLine();

            while (line != null) {


                String[] collumnE = line.split(",");
                System.out.println("----> array ----->" +Arrays.toString(collumnE));
                if(collumnE.length > 4){
                    list.add(collumnE[4]);
                }
                System.out.println("====> Lista ====>" + list);
                line = bf.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }

    public static ArrayList<String> readFileUserCollumnA(){

        //Esse aqui vai pegar os valores que vierem do anexo que o usuário vai enviar

        ArrayList<String> list = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader("/home/caua/Documentos/Dev/Backend/LearnFolders/Data/grupos.xls"))){

            String line = bf.readLine();
            bf.readLine();
//            bf.readLine();

            while (line != null) {

                String[] collumnA = line.split(",");
                System.out.println("Array ---->" + Arrays.toString(collumnA));
                list.add(collumnA[0]);
                System.out.println("Lista ====>" + list);
                line = bf.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(list);
        return list;
    }

}
