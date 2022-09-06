package java;
import java.sql.*;

public class ConnectMysql {
   static final String DB_URL = "jdbc:mysql://localhost/world";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static final String QUERY = "select ID, NAME, AGE, ADDRESS, SALARY " + 
                                "from city";

   public static void main(String[] args) {
      // Open a connection
      try {
        Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery(QUERY);
         // Extract data from result set
         while (rs.next()) {
            // Retrieve by column name
            System.out.print("ID: " + rs.getString("id"));
            System.out.print(", Age: " + rs.getInt("age"));
            System.out.print(", NAME: " + rs.getString("name"));
            System.out.print(", SALARY: " + rs.getInt("salary"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}