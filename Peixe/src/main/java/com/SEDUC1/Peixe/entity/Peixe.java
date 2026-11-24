package com.SEDUC1.Peixe.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Peixe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomePeixe;
    private int pesso;
    private String lago;
    private String especie;

    public Peixe(Long id, String nomePeixe, int pesso, String lago, String especie) {
        this.id = id;
        this.nomePeixe = nomePeixe;
        this.pesso = pesso;
        this.lago = lago;
        this.especie = especie;
    }

    public Peixe() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNomePeixe() {
        return nomePeixe;
    }

    public void setNomePeixe(String nomePeixe) {
        this.nomePeixe = nomePeixe;
    }

    public int getPesso() {
        return pesso;
    }

    public void setPesso(int pesso) {
        this.pesso = pesso;
    }

    public String getLago() {
        return lago;
    }

    public void setLago(String lago) {
        this.lago = lago;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
}


