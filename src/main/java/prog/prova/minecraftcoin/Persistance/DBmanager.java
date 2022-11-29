package prog.prova.minecraftcoin.Persistance;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBmanager {
    private static DBmanager instance;
    private DBmanager(){}

    public static DBmanager getInstance() {
        if (instance == null) {
            instance = new DBmanager();
        }
        return instance;
    }

    private Connection connection = null;

    public Connection getConnection() {
        if (connection == null) {
            try {
                connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/", "postgres", "12345");
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }
}
