
package com.example.tareagtics.Models.Entities;

public class RecetaIngredienteDTO {
    private String nombre;
    private String tiempoPreparacion;
    private Integer cantIng; // cantidad de ingredientes

    // Constructor
    public RecetaIngredienteDTO(String nombre, String tiempoPreparacion, Integer cantIng) {
        this.setNombre(nombre);
        this.setTiempoPreparacion(tiempoPreparacion);
        this.setCantIng(cantIng);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(String tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public Integer getCantIng() {
        return cantIng;
    }

    public void setCantIng(Integer cantIng) {
        this.cantIng = cantIng;
    }

    // Getters y setters
}