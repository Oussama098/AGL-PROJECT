/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.sql.Date;
import java.util.Vector;
import utility.ErrorException;

/**
 *
 * @author oussa
 */
public class usager {
    private int id;
    private String nom;
    private String prenom;
    private Date dateNais;
    private String sexe;
    private String adresse;
    private String tel;
    
    
    public usager(){
        
    }
    public usager(int id){
        this.id=id;
    }
    public usager(int id ,String nom, String prenom, Date dateNais,String sexe, String adresse, String tel) {
        this.id=id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
        this.sexe = sexe;
        this.adresse = adresse;
        this.tel = tel;
        
    }
    
    public usager(String nom, String prenom, Date dateNais,String sexe, String adresse, String tel) {
        this.nom = nom;
        this.prenom = prenom;
        this.dateNais = dateNais;
        this.sexe = sexe;
        this.adresse = adresse;
        this.tel = tel;
        
    }
    public int getId() {
        return id;
    }

    public void setId(int id) throws ErrorException {
        if (id <= 0) {
            throw new ErrorException("Identifiant Usager non valide !");
        }
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) throws ErrorException {
        if (null != nom) {
            if (nom.length() < 2) {
                throw new ErrorException("Le nom de l'usager doit contenir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new ErrorException("Merci de saisir le nom de l'usager");
        }
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) throws ErrorException {
        if (null != prenom) {
            if (prenom.length() < 3) {
                throw new ErrorException("Le prénom de l'usager doit contenir "
                        + "au moins 3 caractères");
            }
        } else {
            throw new ErrorException("Merci de saisir le prénom de l'usager");
        }
        this.prenom = prenom;
    }

    public Date getDateNais() {
        return dateNais;
    }

    public void setDateNais(Date dateNais) {
        this.dateNais = dateNais;
    }

    public String getSexe() {
        return this.sexe;
    }

    public void setSexe(String sexe) throws ErrorException {
        if (null == sexe) {
            throw new ErrorException("Merci de préciser le sexe de l'usager");
        }
        this.sexe = sexe;
    }

    public String getAdresse() {
        return this.adresse;
    }

    public void setAdresse(String adresse) throws ErrorException {
        if (null != adresse) {
            if (adresse.length() < 5) {
                throw new ErrorException("L'adresse doit contenir "
                        + "au moins 10 caractères");
            }
        } else {
            throw new ErrorException("Merci de renseigner l'adresse de l'usager");
        }
        this.adresse = adresse;
    }

    public String getTel() {
        return this.tel;
    }

    public void setTel(String tel) throws ErrorException {
        if (null != tel) {
            if (tel.length() < 10) {
                throw new ErrorException("Le numero de téléphone doit se composer \n"
                        + "au moins de 10 chiffres");
            }
        } else {
            throw new ErrorException("Merci de saisir un numéro de téléphone ");
        }
        this.tel = tel;
    }
    @Override
    public String toString() {
        return "Usager{" + "id=" + id + ", nom=" + nom + ", prenom=" + prenom
                + ", dateNais=" + dateNais + ", sexe=" + sexe + ", adresse="
                + adresse + ", tel=" + tel + '}';
    }
}
