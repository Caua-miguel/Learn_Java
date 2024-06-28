package me.cauadeveloper.Win.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class sqliteConnection {

    // O que precisamos para um connecção com banco de dados:
    // drivers do SQLite
    // DriveManager para se comunicar com a conecção

    public static Connection getConn() throws SQLException{

        try{
            String url = "jdbc:sqlite:C:\\Users\\caua.rocha\\IdeaProjects\\File_Aplication\\src\\main\\java\\me\\cauadeveloper\\Win\\database\\data\\data.db";
            return DriverManager.getConnection(url);
        }catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }

}
