package com.example.appresto.modele.metier;

public class Restaurant {
    private String nomResto;
    private String villeResto;
    private String numResto;
    private String voieResto;
    private String cpResto;
    private String descResto;
    private String horaireResto;

    public Restaurant(String nomResto, String villeResto, String numResto, String voieResto, String cpResto, String descResto, String horaireResto) {
        this.nomResto = nomResto;
        this.villeResto = villeResto;
        this.numResto = numResto;
        this.voieResto = voieResto;
        this.cpResto = cpResto;
        this.descResto = descResto;
        this.horaireResto = horaireResto;
    }

    public String getNomResto() {
        return nomResto;
    }

    public void setNomResto(String nomResto) {
        this.nomResto = nomResto;
    }

    public String getVilleResto() {
        return villeResto;
    }

    public void setVilleResto(String villeResto) {
        this.villeResto = villeResto;
    }

    public String getNumResto() {
        return numResto;
    }

    public void setNumResto(String numResto) {
        this.numResto = numResto;
    }

    public String getVoieResto() {
        return voieResto;
    }

    public void setVoieResto(String voieResto) {
        this.voieResto = voieResto;
    }

    public String getCpResto() {
        return cpResto;
    }

    public void setCpResto(String cpResto) {
        this.cpResto = cpResto;
    }

    public String getDescResto() {
        return descResto;
    }

    public void setDescResto(String descResto) {
        this.descResto = descResto;
    }

    public String getHoraireResto() {
        return horaireResto;
    }

    public void setHoraireResto(String horaireResto) {
        this.horaireResto = horaireResto;
    }

    @Override
    public String toString() {
        return nomResto + ", " + villeResto;
    }
}
