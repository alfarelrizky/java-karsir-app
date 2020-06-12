/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package karsir.app.sederhana;
import java.sql.*;
/**
 *
 * @author hp
 */
public class koneksi {
    Connection con;
     public Connection getConnection(){
        try{
        con=DriverManager.getConnection("jdbc:mysql://localhost/pbo_karsir_java","root","");

        }catch(Exception e){
            System.out.println(e);
        }
        return con;
    }
}
