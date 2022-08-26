package Practice_1401_06_03.Question3.repository;

import Practice_1401_06_03.Question3.entity.Person;
import Practice_1401_06_03.Question3.service.ApplicationConstant;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public Person findById(int id) throws SQLException {
        String sql = "SELECT * FROM persons WHERE id = ?";
        PreparedStatement find = ApplicationConstant.getConnection().prepareStatement(sql);
        find.setInt(1, id);
        ResultSet resultSet = find.executeQuery();
        if (resultSet.next()) {
            Person person = new Person(resultSet.getInt("person_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    resultSet.getInt("age"),
                    resultSet.getInt("score"),
                    resultSet.getString("mobile_number"));
            return person;
        }
        return null;
    }

    public List<Person> findByName(String name) throws SQLException {
        List<Person> persons = new ArrayList<>();
        String sql = "SELECT * FROM persons WHERE first_name = ?";
        PreparedStatement find = ApplicationConstant.getConnection().prepareStatement(sql);
        find.setString(1, name);
        ResultSet resultSet = find.executeQuery();
        while (resultSet.next()) {
            Person person = new Person(resultSet.getInt("person_id"),
                    resultSet.getString("first_name"),
                    resultSet.getString("last_name"),
                    resultSet.getString("gender"),
                    resultSet.getInt("age"),
                    resultSet.getInt("score"),
                    resultSet.getString("mobile_number"));
            persons.add(person);
        }
        return persons;
    }
}
