/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jbdc.utilities;

import java.sql.*;

/**
 *
 * @author Lenovo
 */
public class MysqlUtility {
   
   private static Connection koneksi;
   
   public static Connection getConnection() {
       if (koneksi == null) {
           try {
               Class.forName("com.mysql.jdbc.Driver");
               
               String url = "jdbc:mysql://localhost:3306/mahasiswa";

               String user = "root";
               String password = "";
               koneksi = DriverManager.getConnection(url, user, password);
               if (koneksi != null) {
                   System.out.println("Koneksi berhasil!");
               }
           } catch (ClassNotFoundException cnfe) {
               System.err.println("Gagal load driver : " + cnfe.getMessage());
           } catch (SQLException sqle) {
               System.err.println("Gagal koneksi : " + sqle.getMessage());
           }
       }
       return koneksi;
   }
}
