package me.cauadeveloper.learn_files.Linux.database.config;

import me.cauadeveloper.learn_files.Linux.database.tables.tableName;

import java.io.File;
import java.sql.SQLException;

public class ApplyMethodsSQLite {

    public static void createTable() throws SQLException {

        File file = new File("/home/caua/Documentos/Dev/Backend/LearnFolders/AplicationFiles/src/main/java/me/cauadeveloper/Linux/database/data/data.db");

        if (!file.exists()){
            tableName.create();
        }
        tableName.insert();
    }

}
