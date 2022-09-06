package java;
import java.sql.*;

public class MiniProjectConnectMysql {
    public static void main(String[] args) {

        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/world ";
        String Query = "select ID, NAME, CountryCode, District, Population " +
                "from city " +
                "where Name = 'Name' ";

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            // insert
            // int id = 323214;
            Query = "insert into city(ID, NAME, CountryCode, District, Population) " +
                    " values (98765, 'Name' , 'AFG', 'Maharashtra', 500)";
            int val = stmt.executeUpdate(Query);

            // select
            Query = "select ID, NAME, CountryCode, District, Population " +
                    "from city " +
                    "where Name = 'Name' ";


            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {
                // Retrieve by column name
                System.out.println("ID: " + rs.getInt("id"));
                System.out.print(", name: " + rs.getString("name"));
                System.out.print(", CountryCode: " + rs.getString("CountryCode"));
                System.out.print(", District: " + rs.getString("District"));
                System.out.print(", Population " + rs.getInt("Population"));
            }
            // update
            Query = "update city " +
            "set Population = 2000 " +
            "where Name = 'Name' " ;
            val = stmt.executeUpdate(Query);

            // select
            System.out.println();
            
            // delete
            Query = "delete from city " +
                    "where Name = 'Name' ";
            val = stmt.executeUpdate(Query);
        
            // select
            System.out.println();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return;

    }
}
