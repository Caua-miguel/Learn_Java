package me.cauadeveloper.Win.Aplication;

import me.cauadeveloper.Win.entities.Product;

import java.io.*;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductApp {
    public static void main(String[] args) throws ParseException {

        List<Product> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter file path: ");
        String sourceFileStr = sc.nextLine();

        File sourceFile = new File((sourceFileStr));
        String sourceFolderStr = sourceFile.getParent();

        boolean success = new File(sourceFolderStr + "/out").mkdir();

        String targetFileStr = sourceFolderStr + "/out/summary.csv";

        try(BufferedReader br = new BufferedReader((new FileReader(sourceFileStr)))){

            String itemCsv = br.readLine();

           while (itemCsv !=null) {

               String[] fields = itemCsv.split(";");
               String nome = fields[0];
               Double price = Double.parseDouble(fields[1]);
               Integer quantity = Integer.parseInt(fields[2]);

               list.add(new Product(nome, price, quantity));

               itemCsv = br.readLine();

           }

           for (Product it: list){
               System.out.println("Name: " + it.getName() + "\n price: " + it.getPrice() + "\nquantity: " + it.getQuantity());
           }

            try(BufferedWriter bw = new BufferedWriter((new FileWriter(targetFileStr)))){
                for (Product item: list){
                    bw.write(item.getName() + "," + String.format("%.2f", item.total()));
                    bw.newLine();
                }

                System.out.println(targetFileStr + "CREATED");

            }catch (IOException e){
                System.out.println("Error writing file: " + e.getMessage());
            }


        }catch(IOException e) {
            System.out.println("Error writing file: " + e.getMessage());
        }

        sc.close();
        }
    }
