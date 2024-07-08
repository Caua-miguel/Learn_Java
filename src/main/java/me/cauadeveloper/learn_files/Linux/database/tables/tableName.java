package me.cauadeveloper.learn_files.Linux.database.tables;

import me.cauadeveloper.learn_files.Linux.database.config.readConfig;
import me.cauadeveloper.learn_files.Linux.database.config.sqliteConn;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;


public class tableName {

    public static void insert(){

        String sql = """
                INSERT OR REPLACE into nome(nome) values (?)
                """;
        String[] arr = readConfig.readLines();
        System.out.print(Arrays.toString(arr));
        try (PreparedStatement stmt = sqliteConn.getConn().prepareStatement(sql)){

            for (int i = 1; i <= arr.length-1; i++){
                stmt.setString(1, arr[i]);
                stmt.execute();
            }

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

    public static void create() throws SQLException{

        String sql = """
                CREATE TABLE nome(
                id integer PRIMARY KEY AUTOINCREMENT NOT NULL,
                nome varchar NOT NULL
                )
                """;
        try(PreparedStatement stmt = sqliteConn.getConn().prepareStatement(sql)){

            stmt.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
