package me.cauadeveloper.learn_files.Win.Aplication;

import me.cauadeveloper.learn_files.Win.database.config.ApplyMethodsSQLite;
import me.cauadeveloper.learn_files.Win.entities.inputFile;

import java.io.IOException;
import java.sql.SQLException;

public class EmpApp {

    public static void main(String[] args) throws IOException, SQLException {

//          inputStr();
            inputFile.inputRead();
//          outputStr();
//            outputWriter();
//            newCSV();
        ApplyMethodsSQLite.createTable();


    }

}
