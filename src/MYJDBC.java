import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;


public class MYJDBC {
    public static Connection getConnection() throws SQLException {

        Connection connection = null;

        try (FileInputStream f = new FileInputStream("db.properties")) {

            // load the properties file
            Properties pros = new Properties();
            pros.load(f);

            // assign db parameters
            String url = pros.getProperty(" jdbc:mysql://localhost:3306/new-db");
            String user = pros.getProperty("dev1");
            String password = pros.getProperty("dev1");


            // create a connection to the database
            connection = DriverManager.getConnection(url, user, password);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

}

