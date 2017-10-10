package test.id.blah;

/**
 * Hello world!
 *
 */
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;

public class OracleJDBC {

    public static void main(String[] argv) {

        try {

            Class.forName("oracle.jdbc.pool.OracleDataSource");

        } catch (ClassNotFoundException e) {

            System.out.println("I miss you -_-");
            e.printStackTrace();
            return;

        }

        System.out.println("JDBC registered");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:oracle:thin:@(DESCRIPTION=(ADDRESS=(PROTOCOL=tcp)(HOST=localhost)(PORT=1))(CONNECT_DATA=(SERVICE_NAME=dummyservice)))", "localhost",
                    "localhost");

        } catch (SQLException e) {

            System.out.println("Invalid uname or pwd or look for error below I dunno");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("hello, world");
        } else {
            System.out.println("rare case");
        }
    }

}
