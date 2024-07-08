package me.cauadeveloper.Linux.database.config;

import java.io.File;
import java.sql.SQLException;

import static me.cauadeveloper.Linux.database.tables.tableName.insert;
import static me.cauadeveloper.Linux.database.tables.tableName.create;

public class ApplyMethodsSQLite {

    public static void createTable() throws SQLException {

        File file = new File("/home/caua/Documentos/Dev/Backend/LearnFolders/AplicationFiles/src/main/java/me/cauadeveloper/Linux/database/data/data.db");

        if (!file.exists()){
            create();
        }
        insert();
    }

}
