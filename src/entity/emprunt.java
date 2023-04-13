/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.util.Date;
import utility.ErrorException;

/**
 *
 * @author oussa
 */
public class emprunt {
    private int id;
    private Date dateEmprunt;
    private Date dateRetour;
    private usager usagerEmprunt;
    private oeuvre oeuvreEmprunt;

    public emprunt(int id,usager usagerEmprunt, oeuvre oeuvreEmprunt , Date dateEmprunt, Date dateRetour) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetour = dateRetour;
        this.usagerEmprunt = usagerEmprunt;
        this.oeuvreEmprunt = oeuvreEmprunt;
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

    public Date getDateRetour() {
        return this.dateRetour;
    }

    public void setDateRetour(Date dateRetour) throws ErrorException {
        if (dateRetour != null) {
            if (this.dateRetour.compareTo(dateEmprunt) > 0) {
                throw new ErrorException("La date de retour effective ne doit pas être avant la"
                        + " date d'emprunt");
            }
        }
        this.dateRetour = dateRetour;
    }

    public Date getDateEmprunt() {
        return this.dateEmprunt;
    }

    public void setDateEmprunt(Date dateEmprunt) throws ErrorException {
        if (null == dateEmprunt) {
            throw new ErrorException("Veuillez renseigner la date d'emprunt");
        }
        this.dateEmprunt = dateEmprunt;
    }

    public Date getDateRetourPrevu() {
        return this.dateRetour;
    }

    public void setDateRetourPrevu(Date dateRetourPrevu) throws ErrorException {
        if (this.dateEmprunt.compareTo(dateRetourPrevu) > 0) {
            throw new ErrorException("La date de retour prévu ne doit pas être avant"
                    + " la date d'emprunt");
        }
        this.dateRetour = dateRetourPrevu;
    }

    public oeuvre getOeuvreEmprunt() {
        return oeuvreEmprunt;
    }

    public void setOeuvreEmprunt(oeuvre oeuvreEmprunt) {
        this.oeuvreEmprunt = oeuvreEmprunt;
    }

    

    

    public usager getUsagerEmprunt() {
        return usagerEmprunt;
    }

    public void setUsagerEmprunt(usager usagerEmprunt) {
        this.usagerEmprunt = usagerEmprunt;
    }
}
