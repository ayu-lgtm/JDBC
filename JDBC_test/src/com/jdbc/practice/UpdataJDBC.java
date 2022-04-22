/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.jdbc.practice;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.*;
/**
 *
 * @author Ayush Rastogi 
 */
public class UpdataJDBC {
    public static void main(String[] args) {
        try{
            Connection con=ConnectionProvider.getConnection();
            
            String q="update table1 set tName=?,tCity=? where tId=?";
            
            Scanner sc = new Scanner(System.in);
            
            System.out.println("Enter New Name :");
            
            String name =sc.next();
            
            System.out.println("Enter New city :");
            String city =sc.next();
            
            System.out.println("Enter Student Id :");
            
            int id = sc.nextInt();
            
            PreparedStatement pstmt=con.prepareStatement(q);
            
            pstmt.setString(1,name);
            pstmt.setString(2,city);
            pstmt.setInt(3,id);
            
            pstmt.executeUpdate();
            
            System.out.print("done......");
            
            con.close();
            
            
        }catch(SQLException e){
            e.getStackTrace();
        }
    }
}
