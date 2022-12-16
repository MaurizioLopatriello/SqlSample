import java.sql.*;

public class SqlClass {

    public static void main(String[] args) {
        try {

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "dev1", "dev1");

            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery("select * from students");

            while (resultSet.next()) {
                System.out.println(resultSet.getString("first_name" )+ " " + resultSet.getString("last_name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
