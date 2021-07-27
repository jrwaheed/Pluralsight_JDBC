import java.sql.*;

public class Application {
    static String url = "jdbc:mysql://localhost:3306/SpringBootDatabase";
    static String username = "root";
    static String password = "TheHulk1*";

    public static void getConnection() throws SQLException {
        try {
            Connection conn = DriverManager.getConnection(url, username, password);

            String sql1 = "insert into customer (first_name, last_name, balance) values ('Miley','Cyrus',200000)";
            PreparedStatement stmt = conn.prepareStatement(sql1);
            int rs = stmt.executeUpdate();

            if(rs > 0){
                System.out.println("Database updated");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}


