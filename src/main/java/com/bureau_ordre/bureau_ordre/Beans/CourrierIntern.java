package com.bureau_ordre.bureau_ordre.Beans;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CourrierIntern extends Courrier{


    @OneToOne
    private Personnel recepteur;
    @OneToOne
    private Personnel emetteur;

    public CourrierIntern() {}

    public CourrierIntern(long numeroCourrier, String methodeEnvoi, Date dateEnvoi, Date dateReception, String objet, String natureCourrier, Personnel recepteur, Personnel emetteur) {
        super(numeroCourrier, methodeEnvoi, dateEnvoi, dateReception, objet, natureCourrier);
        this.recepteur = recepteur;
        this.emetteur = emetteur;
    }

    public Personnel getRecepteur() {
        return recepteur;
    }

    public void setRecepteur(Personnel recepteur) {
        this.recepteur = recepteur;
    }

    public Personnel getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Personnel emetteur) {
        this.emetteur = emetteur;
    }
}
