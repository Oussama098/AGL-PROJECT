/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entity.oeuvre;
import entity.usager;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author oussa
 */
public class usagerController {
    private Connection con;

    public usagerController() {
        this.con=connexion.getInstance().getCon();
    }
    
    public ArrayList<usager> getAll(){
        try {
            PreparedStatement pst = this.con.prepareStatement("select * from usager");
            ResultSet rs = pst.executeQuery();
            ArrayList<usager> tab = new ArrayList();
            while (rs.next()){
                tab.add(new usager(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getDate(4),rs.getString(5),rs.getString(6),rs.getString(7)));
            }
            return tab;
        } catch (Exception e) {
            return null;
        }
    }
    public void ajouterUsager(usager usager){
        try {
            PreparedStatement pst = this.con.prepareStatement("insert into usager values (null , ? , ? , ? , ? , ?,?)");
            pst.setString(1, usager.getNom());
            pst.setString(2, usager.getPrenom());
            pst.setDate(3, usager.getDateNais());
            pst.setString(4, usager.getSexe());
            pst.setString(5, usager.getAdresse());
            pst.setString(6, usager.getTel());
            int p = pst.executeUpdate();
            if(p==0){
                JOptionPane.showMessageDialog(null, "impossible d'ajouter ce usager");
            }else{
                JOptionPane.showMessageDialog(null, "usager est ajoute avec succes");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
    public void supprimerUsager(usager usager){
         try {
            PreparedStatement pst = this.con.prepareStatement("delete from usager where ID = ? and Nom = ? and Prenom = ? and DateNais = ? and sexe= ?  and adresse = ? and tel = ? ");
            pst.setInt(0, usager.getId());
            pst.setString(1, usager.getNom());
            pst.setString(2, usager.getPrenom());
            pst.setDate(3, usager.getDateNais());
            pst.setString(4, usager.getSexe());
            pst.setString(5, usager.getAdresse());
            pst.setString(5, usager.getTel());
            int p = pst.executeUpdate();
            if(p==0){
                JOptionPane.showMessageDialog(null, "impossible de supprimer ce usager");
            }else{
                JOptionPane.showMessageDialog(null, "usager est supprimee avec succes");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void modifierusager(usager usager){
        try {
            PreparedStatement pst = this.con.prepareStatement(" update usager set Nom = ? and Prenom = ? and DateNais = ? and sexe= ?  and adresse = ? and tel = ? where ID = ?");
            pst.setString(1, usager.getNom());
            pst.setString(2, usager.getPrenom());
            pst.setDate(3, usager.getDateNais());
            pst.setString(4, usager.getSexe());
            pst.setString(5, usager.getAdresse());
            pst.setString(5, usager.getTel());
            pst.setInt(6, usager.getId());
            int p = pst.executeUpdate();
            if(p==0){
                JOptionPane.showMessageDialog(null, "impossible de modifier ce usager");
            }else{
                JOptionPane.showMessageDialog(null, "usager est modifiee avec succes");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public usager findById(int id){
    try {
        PreparedStatement pst = this.con.prepareStatement("select * from usager where ID=?");
        pst.setInt(1, id);
        ResultSet rs = pst.executeQuery();
        usager usager = null;
        if(rs.next()){
            usager = new usager(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7));
        }
        return usager;
    } catch (Exception e) {
        return null;
    }
}
    
    public static void main(String[] args){
        try {
            SimpleDateFormat s= new SimpleDateFormat("yyyy-MM-dd");
            new usagerController().ajouterUsager(new usager("oussama","el bakri" , new Date(102,8,30),"M" , "", ""));

        } catch (Exception e) {
        }
        }
        
    
    
}
