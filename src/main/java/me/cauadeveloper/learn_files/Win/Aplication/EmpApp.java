package me.cauadeveloper.learn_files.Win.Aplication;

import me.cauadeveloper.learn_files.Win.database.config.ApplyMethodsSQLite;

import java.io.IOException;
import java.sql.SQLException;

import static me.cauadeveloper.learn_files.Win.Entities.inputFile.inputRead;

public class EmpApp {

    public static void main(String[] args) throws IOException, SQLException {

//          inputStr();
            inputRead();
//          outputStr();
//            outputWriter();
//            newCSV();
        ApplyMethodsSQLite.createTable();


    }

}
