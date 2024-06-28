package me.cauadeveloper.Win.database.tables;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import static me.cauadeveloper.Win.database.config.sqliteConnection.getConn;
import static me.cauadeveloper.Win.entities.inputFile.inputRead;

public class tableName {


    public static void insert(){

        //Fazer um loop no setString para inserir os valores linha a linha

        String sql = """
                INSERT OR REPLACE into nome(nome) values (?)
                """;
        StringBuilder txt = inputRead();
        String test = String.valueOf(txt);

        try (PreparedStatement stmt = getConn().prepareStatement(sql)){

            stmt.setString(1, test);
            stmt.execute();

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
