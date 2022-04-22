//program for jdbc 
import java.sql.*;
class JDBC_Establish_Connection{
    public static void main(String args[]){
        try{
            //load driver
            Class.forName("com.mysql.cj.jdbc.Driver");


            String url="jdbc:mysql://localhost:3306/mybank";
            String user ="root";
            String password="";

            //create a connection
            Connection con = DriverManager.getConnection(url, user, password);

            if(con.isClosed()){
                System.out.print("Connetion is closed.");
            }else{
                System.out.print("Connetion connected...");
            }



        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}