package com.bureau_ordre.bureau_ordre.Beans;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CourrierDepart extends Courrier{


    @OneToOne
    private Etablissement recepteur;
    @OneToOne
    private Personnel emetteur;

    public CourrierDepart() {
    }

    public CourrierDepart(long numeroCourrier, String methodeEnvoi, Date dateEnvoi, Date dateReception, String objet, String natureCourrier, Etablissement recepteur, Personnel emetteur) {
        super(numeroCourrier, methodeEnvoi, dateEnvoi, dateReception, objet, natureCourrier);
        this.recepteur = recepteur;
        this.emetteur = emetteur;
    }

    public Etablissement getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Etablissement recepteur) {
        this.recepteur = recepteur;
    }

    public Personnel getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Personnel emetteur) {
        this.emetteur = emetteur;
    }
}
