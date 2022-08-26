package Practice_1401_06_03.Question3.service;

import java.sql.Connection;

public class ApplicationConstant {
    private static Connection connection = new DBHelper().connect();
    public static Connection getConnection(){
        return connection;
    }
}
