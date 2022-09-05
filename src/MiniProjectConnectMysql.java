import java.sql.*;

public class MiniProjectConnectMysql {
    public static void main(String[] args) {

        final String USER = "root";
        final String PASS = "tbrs00002b";
        final String DB_URL = "jdbc:mysql://localhost/world ";
        String Query = "select Code,Name,Continent,Region " +
        "from country " +
        "where Name like '%an%' ";
    

        try {
            Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(Query);

            while (rs.next()) {
                // Retrieve by column name
                System.out.println("CODE: " + rs.getString("Code"));
                System.out.print(", NAME: " + rs.getString("name"));
                System.out.print(", CONTINENT: " + rs.getString("Continent"));
                System.out.print(", REGION: " + rs.getString("Region"));
             }

    } catch (SQLException e) {
            e.printStackTrace();



        // conect
        // java 서버:
        // java 유저:
        // java 비번:
        // java 커리

        // java 서버 유저 비번
        // java 커리
        // 프린트


        // 캐치문

        
        //return;
    }
    return ;

    }
}


