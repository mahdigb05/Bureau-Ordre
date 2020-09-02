package com.bureau_ordre.bureau_ordre.Beans;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Date;

@MappedSuperclass
public class Courrier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroCourrier;
    @NotNull
    @Column(nullable = false)
    private String methodeEnvoi;
    @NotNull
    @Column(nullable = false)
    private String objet;
    @NotNull
    @Column(nullable = false)
    private String natureCourrier;

    public Courrier() {
    }

    public Courrier(long numeroCourrier, String methodeEnvoi, String objet, String natureCourrier) {
        this.numeroCourrier = numeroCourrier;
        this.methodeEnvoi = methodeEnvoi;
        this.objet = objet;
        this.natureCourrier = natureCourrier;
    }

    public long getNumeroCourrier() {
        return numeroCourrier;
    }

    public void setNumeroCourrier(long numeroCourrier) {
        this.numeroCourrier = numeroCourrier;
    }

    public String getMethodeEnvoi() {
        return methodeEnvoi;
    }

    public void setMethodeEnvoi(String methodeEnvoi) {
        this.methodeEnvoi = methodeEnvoi;
    }



    public String getObjet() {
        return objet;
    }

    public void setObjet(String objet) {
        this.objet = objet;
    }

    public String getNatureCourrier() {
        return natureCourrier;
    }

    public void setNatureCourrier(String natureCourrier) {
        this.natureCourrier = natureCourrier;
    }

}
