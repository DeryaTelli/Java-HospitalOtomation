package Helper;
import java.sql.*;

public class DBConnection {
    Connection c= null;
    public DBConnection(){}
    public Connection connDn(){
        try {
            this.c=DriverManager.getConnection("jdbc:mariadb://localhost:3306/hospital?user=root&password=26112");
            //database baglantisini yaptik
            return c;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

}
