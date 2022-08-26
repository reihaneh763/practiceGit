package Practice_1401_06_03.Question1;

import java.sql.*;
import java.util.ArrayList;

public class Main {
    public final static String URL = "jdbc:postgresql://127.0.0.1:5432/maktab";
    public final static String USERNAME = "postgres";
    public final static String PASSWORD = "Rm@38936";

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //Class.forName("org.postgresql.Driver");
        Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from persons");
        while (resultSet.next()) {
            System.out.print(resultSet.getInt("person_id") + ", ");
            System.out.println(resultSet.getString("first_name"));
        }
        System.out.println("****************************************************");
        String insertQuery = "INSERT INTO persons (person_id, first_name, last_name, gender,age, score, mobile_number) VALUES (?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(insertQuery);
        preparedStatement.setInt(1, 13);
        preparedStatement.setString(2, "kaveh");
        preparedStatement.setString(3, "zahedi");
        preparedStatement.setString(4, "m");
        preparedStatement.setInt(5, 32);
        preparedStatement.setInt(6, 95);
        preparedStatement.setString(7, "09125721645");

        System.out.println("insert Status:" + preparedStatement.executeUpdate());
        System.out.println("****************************************************");

        String deleteQuery = "DELETE FROM persons WHERE person_id = ?";
        PreparedStatement preparedStatement1 = connection.prepareStatement(deleteQuery);
        preparedStatement1.setInt(1, 5);
        preparedStatement1.executeUpdate();
        System.out.println("delete Status:" + preparedStatement.executeUpdate());
        System.out.println("****************************************************");

        String updateQuery = "UPDATE persons SET first_name = ? WHERE person_id = ?";
        PreparedStatement preparedStatement2 = connection.prepareStatement(updateQuery);
        preparedStatement2.setString(1, "kimia");
        preparedStatement2.setInt(2, 7);
        preparedStatement2.executeUpdate();
        System.out.println("update Status:" + preparedStatement.executeUpdate());
        System.out.println("****************************************************");

        Statement statement1 = connection.createStatement();
        ResultSet resultSet1 = statement.executeQuery("select * from persons");
        while (resultSet1.next()) {
            System.out.print(resultSet1.getInt("person_id") + ", ");
            System.out.print(resultSet1.getString("first_name"));
        }
    }
}
