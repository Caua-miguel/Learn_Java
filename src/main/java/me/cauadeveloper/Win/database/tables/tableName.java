package me.cauadeveloper.Win.database.tables;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import static me.cauadeveloper.Win.database.config.Conn.getConn;

public class tableName {

    public static void create() throws SQLException{

        String sql = """
                CREATE TABLE nome(
                id integer PRIMARY KEY AUTOINCREMENT NOT NULL,
                nome varchar(255) NOT NULL
                )
                """;
        try(PreparedStatement stmt = getConn().prepareStatement(sql)){

            stmt.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }

    }

}
