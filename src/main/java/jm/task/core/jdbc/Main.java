package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/my_dbtest";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
//        userDaoJDBC.createUsersTable();
//        userDaoJDBC.saveUser("Maxim", "Mantulin", (byte) 26);
//        userDaoJDBC.saveUser("Alexey", "Soshnikov", (byte) 27);
//        userDaoJDBC.saveUser("Maxim", "Zhelyabovsky", (byte) 28);
//        userDaoJDBC.saveUser("Alexandr", "Podshyvailov", (byte) 26);
//        System.out.println(userDaoJDBC.getAllUsers());
//        userDaoJDBC.dropUsersTable();
//        System.out.println(userDaoJDBC.getAllUsers());
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Connection creation error...");
        }
        return connection;
    }

}
