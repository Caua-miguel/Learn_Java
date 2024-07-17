package me.cauadeveloper.learn_files.Win.database.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conn {

    // O que precisamos para um connecção com banco de dados:
    // drivers do SQLite
    // DriveManager para se comunicar com a conecção

    public static Connection getConn() throws SQLException{

        try{
            String url = "jdbc:sqlite:C:\\Dev\\AplicationFiles\\data.db";
            return DriverManager.getConnection(url);
        }catch (SQLException e){
            e.printStackTrace();
        }
    return null;
    }

}
