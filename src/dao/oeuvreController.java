/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;
import entity.oeuvre;
import java.sql.*;
import java.util.*;
/**
 *
 * @author oussa
 */
public class oeuvreController {
    
    private Connection con;
    public oeuvreController() {
        this.con = connexion.getInstance().getCon();
    }
    
    public ArrayList<oeuvre> getAll(){
        try {
            PreparedStatement pst = this.con.prepareStatement("select * from oeuvre");
            ResultSet rs = pst.executeQuery();
            ArrayList<oeuvre> tab = new ArrayList();
            while(rs.next()){
                tab.add(new oeuvre(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5)));
            }
            return tab;
        } catch (Exception e) {
            return null;
        }
    }
    
    public void add(oeuvre oeuvre){
        try {
            PreparedStatement pst = this.con.prepareStatement("insert into oeuvre values (null , ?,?,?,?)");
            pst.setString(1, oeuvre.getISBN());
            pst.setString(2, oeuvre.getTitre());
            pst.setString(3, oeuvre.getAuteur());
            pst.setString(4, oeuvre.getCategorie());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }
    
    public void modifier(oeuvre oeuvre){
        try {
            PreparedStatement pst = this.con.prepareStatement("update oeuvre set ISBN=? and titre = ? and auteur = ? and categorie= ? where ID=?");
            pst.setString(1, oeuvre.getISBN());
            pst.setString(2, oeuvre.getTitre());
            pst.setString(3, oeuvre.getAuteur());
            pst.setString(4, oeuvre.getCategorie());
            pst.setInt(5, oeuvre.getId());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void supprimer(oeuvre oeuvre){
        try {
            PreparedStatement pst = this.con.prepareStatement("delete from oeuvre where  ISBN=? and titre = ? and auteur = ? and categorie= ? ");
            pst.setString(1, oeuvre.getISBN());
            pst.setString(2, oeuvre.getTitre());
            pst.setString(3, oeuvre.getAuteur());
            pst.setString(4, oeuvre.getCategorie());
            pst.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
   public oeuvre findById(int id){
       try {
           PreparedStatement pst = this.con.prepareStatement("select ISBN , titre , auteur , categorie from oeuvre where ID=?");
           pst.setInt(1, id);
           ResultSet rs = pst.executeQuery();
           oeuvre oeuvre = null;
           if(rs.next()){
               oeuvre = new oeuvre(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4));
           }
           return oeuvre;
       } catch (Exception e) {
           return null;
       }
   }
   
   public oeuvre findByTitre(String titre){
       try {
           PreparedStatement pst = this.con.prepareStatement("select ID, ISBN , titre , auteur , categorie from oeuvre where titre=?");
           pst.setString(1, titre);
           ResultSet rs = pst.executeQuery();
           oeuvre oeuvre = null;
           if(rs.next()){
               oeuvre = new oeuvre(rs.getInt("ID"),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
           }
           return oeuvre;
       } catch (Exception e) {
           return null;
       }
   }
    
    public static void main(String[] args){
        System.out.println(new oeuvreController().findByTitre("1984"));
    }
}
