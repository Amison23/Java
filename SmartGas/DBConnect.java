package SmartGas;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {

    public Connection myConnect() {
        Connection connect = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            connect = DriverManager.getConnection(""
                    + "jdbc:mysql://localhost/smart_gas"
                    + "?user=root&password=");
            System.out.println("Connection Succesful!");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Cannot connect to Property DB " + e.getMessage());
        }
        return connect;
    }
}
