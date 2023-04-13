/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Vector;
import utility.ErrorException;

/**
 *
 * @author oussa
 */
public class oeuvre {
    private int id; 
    private String ISBN,titre,auteur,categorie;
    
    public oeuvre(){
        
    }
    
    public oeuvre(int id){
        this.id=id;
    }
    public oeuvre(String titre){
        this.titre= titre;
    }
    public oeuvre( int id , String ISBN, String titre , String auteur, String categorie) {
        this.id=id;
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
        this.ISBN = ISBN;
    }
    public oeuvre( String ISBN, String titre , String auteur, String categorie) {
        this.titre = titre;
        this.auteur = auteur;
        this.categorie = categorie;
        this.ISBN = ISBN;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) throws ErrorException {
        if (id <= 0) {
            throw new ErrorException("Identifiant Oeuvre non valide !");
        }
        this.id = id;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    
    
    public String getCategorie() {
        return this.categorie;
    }

    public void setCategorie(String categorie) throws ErrorException {
        if (null != categorie) {
            if (categorie.length() < 3) {
                throw new ErrorException("Le nom de la catégorie doit contenir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new ErrorException("Merci de saisir une catégorie ");
        }
        this.categorie = categorie;
    }

    public String getAuteur() {
        return this.auteur;
    }

    public void setAuteur(String auteur) throws ErrorException {
        if (null != auteur) {
            if (auteur.length() < 3) {
                throw new ErrorException("Le nom de l'auteur doit avoir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new ErrorException("Merci de saisir un nom ");
        }
        this.auteur = auteur;
    }

    public String getTitre() {
        return this.titre;
    }

    public void setTitre(String titre) throws ErrorException {
        if (null != titre) {
            if (titre.length() < 3) {
                throw new ErrorException("Le titre doit avoir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new ErrorException("Merci de saisir le titre de l'oeuvre ");
        }
        this.titre = titre;
    }

    @Override
    public String toString() {
        return "oeuvre{" + "id=" + id + ", ISBN=" + ISBN + ", titre=" + titre + ", auteur=" + auteur + ", categorie=" + categorie + '}';
    }

    

    

}