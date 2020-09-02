package com.bureau_ordre.bureau_ordre.Beans;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CourrierArrive extends Courrier {

    @NotNull
    @Column(nullable = false)
    private Date dateEnvoi;
    @NotNull
    @Column(nullable = false)
    private Date dateReception;
    @OneToOne
    @NotNull
    @JoinColumn(nullable = false)
    private Personnel recepteur;
    @OneToOne
    @NotNull
    @JoinColumn(nullable = false)
    private Etablissement emetteur;

    public CourrierArrive() {
    }

    public CourrierArrive(long numeroCourrier, String methodeEnvoi, String objet, String natureCourrier, Date dateEnvoi, Date dateReception, Personnel recepteur, Etablissement emetteur) {
        super(numeroCourrier, methodeEnvoi, objet, natureCourrier);
        this.dateEnvoi = dateEnvoi;
        this.dateReception = dateReception;
        this.recepteur = recepteur;
        this.emetteur = emetteur;
    }

    public Date getDateEnvoi() {
        return dateEnvoi;
    }

    public void setDateEnvoi(Date dateEnvoi) {
        this.dateEnvoi = dateEnvoi;
    }

    public Date getDateReception() {
        return dateReception;
    }

    public void setDateReception(Date dateReception) {
        this.dateReception = dateReception;
    }

    public Personnel getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Personnel recepteur) {
        this.recepteur = recepteur;
    }

    public Etablissement getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Etablissement emetteur) {
        this.emetteur = emetteur;
    }
}
