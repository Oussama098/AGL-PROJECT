/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import entity.*;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
//import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import javax.swing.JOptionPane;
//import java.util.Date;
import utility.ErrorException;

/**
 *
 * @author oussa
 */
public class empruntController {
    
    private Connection con;

    public empruntController() {
        this.con=connexion.getInstance().getCon();
    }
    
    
    public void emprunter(int usager,int oeuvre) throws ErrorException {
        try {
            //SimpleDateFormat s = new SimpleDateFormat("yyyy-MM-dd");
            PreparedStatement pst= con.prepareStatement("insert into emprunt values (null , ? , ? , CURRENT_DATE , null) ");
            pst.setInt(1, usager);
            pst.setInt(2,oeuvre);
            
            int i =pst.executeUpdate();
            if(i==0){   
                JOptionPane.showMessageDialog(null, "impossible d'emprunter ce livre");
            }else{
                JOptionPane.showMessageDialog(null, "le livre est empruntee");
            }
            pst.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete(oeuvre oeuvre) throws ErrorException {
        final String SQL_DELETE_BY_ID = "DELETE FROM emprunt WHERE ExemplaireId = ? ";
        try {
            PreparedStatement pst = this.con.prepareStatement(SQL_DELETE_BY_ID);
            pst.setInt(1, oeuvre.getId());
            pst.executeUpdate();
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<emprunt> findEmprunts(oeuvre oeuvre){
        try {
            
       
           PreparedStatement pst = this.con.prepareStatement("select * from emprunt where oeuvreID=?");
           pst.setInt(1, oeuvre.getId());
           ResultSet rs = pst.executeQuery();
           ArrayList<emprunt> tab = new ArrayList();
           while(rs.next()){
               tab.add(new emprunt(rs.getInt(1),(usager)rs.getObject(2),(oeuvre)rs.getObject(3),rs.getDate(4),rs.getDate(5)));
           }
           
           return tab;
   
        } catch (Exception e) {
            return null;
        }
    }

//    public emprunt find(oeuvre oeuvre){
//        try {
//            PreparedStatement pst = this.con.prepareStatement("select * from emprunt where ExemplaireId= ?");
//            pst.setInt(1, oeuvre.getId());
//            ResultSet rs=pst.executeQuery();
//            emprunt ep ;
//            if(rs.next()){
//                ep= new emprunt(rs.getInt(1),rs.get, );
//            }
//        } catch (Exception e) {
//        }
//    }
    
        public static void main(String[] args){
            System.out.println(new empruntController().findEmprunts(new oeuvre(4)));
        }
    
}
