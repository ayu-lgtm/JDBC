import java.sql.DriverManager;



import java.sql.*;

public class JDBC_insertTable {
    public static void main(String args[]){
        try{
            //upload driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            //create connection
            String url="jdbc:mysql://localhost:3306/mybank";
            String user ="root";
            String password="";

            
            Connection  con = DriverManager.getConnection(url,user,password);

           
            String q="INSERT INTO table1(tName,tCity)VALUES(?,?)";

            //prepared statement
            PreparedStatement pstmt = con.prepareStatement(q);
            
            //set the values to query 
            pstmt.setString(1, "Ayush Rastogi");
            pstmt.setString(2, "Lucknow");

            pstmt.executeUpdate();
            
            System.out.println(q+" is Inserted");

            con.close();



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
