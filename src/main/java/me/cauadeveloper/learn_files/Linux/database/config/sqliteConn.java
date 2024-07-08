package me.cauadeveloper.learn_files.Linux.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqliteConn {

    public static Connection getConn() throws SQLException {

        try{
            String url = "jdbc:sqlite:/home/caua/Documentos/Dev/Backend/LearnFolders/AplicationFiles/src/main/java/me/cauadeveloper/Linux/database/data/data.db";
            return DriverManager.getConnection(url);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
