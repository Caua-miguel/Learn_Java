package me.cauadeveloper.Linux.Aplication;

import java.io.IOException;
import java.sql.SQLException;

import me.cauadeveloper.Linux.Entities.createFile;
import me.cauadeveloper.Linux.database.config.ApplyMethodsSQLite;

public class Aplication {

    public static void main(String[] args) throws IOException, SQLException {

//        printStr();
//        System.out.println("--------------------------");
//        printReader();
//        System.out.println("--------------------------");
//        outputStr();
//        createFile.createDataFile();
        ApplyMethodsSQLite.createTable();

    }

}
