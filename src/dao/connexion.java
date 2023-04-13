/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.*;

/**
 *
 * @author oussa
 */
public class connexion {
    private Connection con;
    private static connexion c = null ;

    public connexion() {
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gestionbilbio","root","");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static connexion getInstance(){
        if(c==null)
            c=new connexion();
        return c;
    }

    public Connection getCon() {
        return con;
    }
    
    public static void main(String[] args){
        if(connexion.getInstance().getCon()==null){
            System.out.println("echec");
        }else{
            System.out.println("succes");
        }
    }
    
    
    
    
}
