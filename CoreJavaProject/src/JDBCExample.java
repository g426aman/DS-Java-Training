import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBCExample {
    public static void main(String[] args) {
        //establish the database connection
        //1.url, username , password ,
        String username="root";
        String password="";
        String url="jdbc:mysql://localhost:3306/javatraining";
        //to make the connection
        try {
            Connection conn= DriverManager.getConnection(url,username,password);
            String name = "Ajay";
            String email = "ajaysingh@gmail.com";
            String mobile = "8009066094";
            String technology= "Java";
            String address = "Lucknow";
            String query= "INSERT INTO Trainer VALUES (?,?,?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(query);
            int Sno = 3;
            stmt.setInt(1,Sno);
            stmt.setString(2,name);
            stmt.setString(3,email);
            stmt.setString(4,mobile);
            stmt.setString(5,technology);
            stmt.setString(6,address);
            stmt.execute();
            System.out.println("Connected to database");
        } catch (SQLException e) {
            throw new RuntimeException("Do not connected"+e);

        }
    }
}
