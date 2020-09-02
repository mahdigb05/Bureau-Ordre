package com.bureau_ordre.bureau_ordre.Beans;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
public class Etablissement {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long numeroEtablissement;
    @NotNull
    @Column(nullable = false)
    private String nomEtablissement;
    @NotNull
    @Column(nullable = false)
    private String adresseEtablissement;
    @NotNull
    @Column(nullable = false)
    private String telEtablissement;

    public Etablissement() {
    }

    public Etablissement(long numeroEtablissement, String nomEtablissement, String adresseEtablissement, String telEtablissement) {
        this.numeroEtablissement = numeroEtablissement;
        this.nomEtablissement = nomEtablissement;
        this.adresseEtablissement = adresseEtablissement;
        this.telEtablissement = telEtablissement;
    }

    public long getNumeroEtablissement() {
        return numeroEtablissement;
    }

    public void setNumeroEtablissement(long numeroEtablissement) {
        this.numeroEtablissement = numeroEtablissement;
    }

    public String getNomEtablissement() {
        return nomEtablissement;
    }

    public void setNomEtablissement(String nomEtablissement) {
        this.nomEtablissement = nomEtablissement;
    }

    public String getAdresseEtablissement() {
        return adresseEtablissement;
    }

    public void setAdresseEtablissement(String adresseEtablissement) {
        this.adresseEtablissement = adresseEtablissement;
    }

    public String getTelEtablissement() {
        return telEtablissement;
    }

    public void setTelEtablissement(String telEtablissement) {
        this.telEtablissement = telEtablissement;
    }
}
