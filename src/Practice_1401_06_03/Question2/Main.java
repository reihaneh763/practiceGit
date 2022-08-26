package Practice_1401_06_03.Question2;

import Practice_1401_06_03.Question2.entity.Persons;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public final static String URL = "jdbc:postgresql://127.0.0.1:5432/maktab";
    public final static String USERNAME = "postgres";
    public final static String PASSWORD = "Rm@38936";
    public static ArrayList<Persons> persons = new ArrayList<Persons>();
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from persons");
        while (resultSet.next()) {
            Persons person = new Persons(resultSet.getInt("person_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    resultSet.getInt("age"),
                    resultSet.getInt("score"),
                    resultSet.getString("mobile_number"));
            persons.add(person);
        }
        System.out.println(persons);
    }
}
