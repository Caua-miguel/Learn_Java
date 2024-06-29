package me.cauadeveloper.Linux.database.tables;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Arrays;

import static me.cauadeveloper.Linux.database.config.readConfig.readLines;
import static me.cauadeveloper.Linux.database.config.sqliteConn.getConn;


public class tableName {

    public static void insert(){

        String sql = """
                INSERT OR REPLACE into nome(nome) values (?)
                """;
        String[] arr = readLines();
        System.out.print(Arrays.toString(arr));
        try (PreparedStatement stmt = getConn().prepareStatement(sql)){

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
        try(PreparedStatement stmt = getConn().prepareStatement(sql)){

            stmt.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
