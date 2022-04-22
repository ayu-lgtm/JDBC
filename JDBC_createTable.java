import java.sql.*;

public class JDBC_createTable {
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mybank";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            // create query

            String q = "create table table1(tId int(20) primary key auto_increment,tName varchar(200) not null,tCity varchar(400))";

            // create a statement
            Statement stmt = con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("Table created in database..");

            con.close();

        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
