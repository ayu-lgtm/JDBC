import java.sql.*;
import java.util.*;

public class JDBC_dynamicInput_Insert {
    public static void main(String args[]){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mybank";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            String q="insert into table1(tName,tCity) values(?,?) ";

            PreparedStatement pstmt=con.prepareStatement(q);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter Name :");

            String name = sc.next();

            System.out.println("Enter City :");

            String city = sc.next();

            pstmt.setString(1, name);
            pstmt.setString(2, city);

            pstmt.executeUpdate();

            con.close();
            sc.close();


        }catch(Exception e ){
            System.out.print(e.getMessage());
        }
    }
}
