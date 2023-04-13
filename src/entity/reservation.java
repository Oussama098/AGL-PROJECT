/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entity;

import java.time.Instant;
import java.util.Date;
import utility.ErrorException;

/**
 *
 * @author oussa
 */
public class reservation {
    private int id;
    private Date dateReservation;
    private Date dateAnnulation;
    private usager usagerReservation;
    private oeuvre oeuvresReservation;

    public reservation(int id, usager usagerReservation, oeuvre oeuvresReservation,Date dateReservation, Date dateAnnulation) {
        this.dateReservation = dateReservation;
        this.dateAnnulation = dateAnnulation;
        this.usagerReservation = usagerReservation;
        this.oeuvresReservation = oeuvresReservation;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) throws ErrorException {
        if (id <= 0) {
            throw new ErrorException("Identifiant Reservation non valide !");
        }
        this.id = id;
    }

    public Date getDateReservation() {
        return dateReservation;
    }

    public void setDateReservation(Date dateReservation) {
        this.dateReservation = dateReservation;
    }

    public Date getDateAnnulation() {
        return dateAnnulation;
    }

    public void setDateAnnulation(Date dateAnnulation) {
        this.dateAnnulation = dateAnnulation;
    }

    public oeuvre getOeuvresReservation() {
        return oeuvresReservation;
    }

    public void setOeuvresReservation(oeuvre oeuvresReservation) {
        this.oeuvresReservation = oeuvresReservation;
    }

    public usager getUsagerReservation() {
        return usagerReservation;
    }

    public void setUsagerReservation(usager usagerReservation) {
        this.usagerReservation = usagerReservation;
    }
}
