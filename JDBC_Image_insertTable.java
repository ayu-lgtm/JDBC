import java.io.FileInputStream;
import java.sql.*;

public class JDBC_Image_insertTable {
    public static void main(String args[]){
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/mybank";
            String user = "root";
            String password = "";

            Connection con = DriverManager.getConnection(url, user, password);

            String q="insert into image(pic) values(?) ";

            PreparedStatement pstmt=con.prepareStatement(q);

            FileInputStream fis = new FileInputStream("download.jpg");

           

            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();

            System.out.println("Image added....");
            
            con.close();


        }catch(Exception e ){
            System.out.print(e.getMessage());
        }
    }
}
