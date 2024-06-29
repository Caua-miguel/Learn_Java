package me.cauadeveloper.Win.Aplication;

import java.io.IOException;
import java.sql.SQLException;
import me.cauadeveloper.Win.database.config.ApplyMethodsSQLite;
import static me.cauadeveloper.Win.database.config.readConfig.readLines;
import static me.cauadeveloper.Win.entities.CreateCSV.newCSV;
import static me.cauadeveloper.Win.entities.inputFile.inputRead;
import static me.cauadeveloper.Win.entities.inputFile.inputStr;
import static me.cauadeveloper.Win.entities.outputFile.outputWriter;
import static me.cauadeveloper.Win.entities.outputFile.outputStr;

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
