import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class SqlClass {

    public static void main(String[] args) {

            // create a new connection from MySQLJDBCUtil
            try (Connection connection =  MYJDBC.getConnection()) {

                // print out a message
                System.out.println(String.format("Connected to database %s "
                        + "successfully.", connection.getCatalog()));
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }