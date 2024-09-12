package com.example.tareagtics.Models.Entities;

import jakarta.persistence.*;

import java.sql.Time;
import java.util.Date;

@Entity
@Table (name = "receta")
public class Receta {

    @Id
    @Column (name = "idreceta", nullable = false, length = 4)
    private Integer idreceta;

    @Column (name = "nombre", length = 200)
    private String nombre;

    @Column (name = "instrucciones", length = 1000)
    private String instrucciones;

    @Column (name = "dificultad")
    private Integer dificultad;

    @Column (name = "tiempo_preparacion")
    private Time tiempoPreparacion;


    @ManyToOne
    @JoinColumn(name = "idcategoria", nullable = false)
    private Categoria categoria;

    public Integer getIdreceta() {
        return idreceta;
    }

    public void setIdreceta(Integer idreceta) {
        this.idreceta = idreceta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getInstrucciones() {
        return instrucciones;
    }

    public void setInstrucciones(String instrucciones) {
        this.instrucciones = instrucciones;
    }

    public Integer getDificultad() {
        return dificultad;
    }

    public void setDificultad(Integer dificultad) {
        this.dificultad = dificultad;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Time getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(Time tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
}
