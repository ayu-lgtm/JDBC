/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;

import java.sql.*;


/**
 *
 * @author Ayush Rastogi
 */
public class Select_JDBC {
    public static void main(String[] args) {
        try {
            Connection con = ConnectionProvider.getConnection();
            
            String q ="Select * from table1";
            
            Statement s =con.createStatement();
            ResultSet set=s.executeQuery(q);
            
            while(set.next()){
                int id=set.getInt(1);
                String name=set.getString(2);
                String city=set.getString(3);
                System.out.println(id+" "+name+" "+city);
            }
            
            con.close();
            
                    
        } catch (SQLException e) {
            System.out.print(e.getMessage());
        }
    }
}
