import java.sql.*;

public class app123 {
   static final String DB_URL = "jdbc:mysql://localhost/world";
   static final String USER = "root";
   static final String PASS = "tbrs00002b";
   static final String QUERY = "select ID, NAME, CountryCode, District, Population" +
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
            System.out.print("ID: " + rs.getInt("id"));
            System.out.print(",CountryCode: " + rs.getString("CountryCode"));
            System.out.print(", NAME: " + rs.getString("NAME"));
            System.out.println(", District: " + rs.getString("District"));
            System.out.println(", Population: " + rs.getInt("Population"));
            

         }
      } catch (SQLException e) {
         e.printStackTrace();
      } 
   }
}