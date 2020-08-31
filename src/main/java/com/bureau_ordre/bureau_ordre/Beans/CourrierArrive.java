package com.bureau_ordre.bureau_ordre.Beans;

import javax.persistence.*;
import java.util.Date;

@Entity
public class CourrierArrive extends Courrier {

    @OneToOne
    private Personnel recepteur;
    @OneToOne
    private Etablissement emetteur;

    public CourrierArrive() {
    }

    public CourrierArrive(long numeroCourrier, String methodeEnvoi, Date dateEnvoi, Date dateReception, String objet, String natureCourrier, Personnel recepteur, Etablissement emetteur) {
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

    public Etablissement getEmetteur() {
        return emetteur;
    }

    public void setEmetteur(Etablissement emetteur) {
        this.emetteur = emetteur;
    }
}
