package com.bureau_ordre.bureau_ordre.Beans;

import com.sun.istack.NotNull;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.Date;

@MappedSuperclass
public class Courrier {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroCourrier;
    @NotNull
    private String methodeEnvoi;
    private Date dateEnvoi;
    private Date dateReception;
    @NotNull
    private String objet;
    @NotNull
    private String natureCourrier;


    public Courrier() {
    }

    public Courrier(long numeroCourrier, String methodeEnvoi, Date dateEnvoi, Date dateReception, String objet, String natureCourrier) {
        this.numeroCourrier = numeroCourrier;
        this.methodeEnvoi = methodeEnvoi;
        this.dateEnvoi = dateEnvoi;
        this.dateReception = dateReception;
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
