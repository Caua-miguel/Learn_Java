package me.cauadeveloper.learn_files.Win.database.config;

import java.io.File;
import java.sql.SQLException;

import static me.cauadeveloper.learn_files.Win.database.tables.tableName.create;
import static me.cauadeveloper.learn_files.Win.database.tables.tableName.insert;

public class ApplyMethodsSQLite {

    public static void createTable() throws SQLException {

        File file = new File("C:\\Users\\caua.rocha\\IdeaProjects\\File_Aplication\\src\\main\\java\\me\\cauadeveloper\\Win\\database\\data\\data.db");

        if (!file.exists()){
            create();
        }
        insert();
    }

}
