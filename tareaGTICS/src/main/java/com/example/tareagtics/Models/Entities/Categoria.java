package com.example.tareagtics.Models.Entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table (name="categoria")
public class Categoria {

    @Id
    @Column (name = "idcategoria", nullable = false, length = 4)
    private Integer idcategoria;

    @Column (name = "categoria", nullable = false, length = 45)
    private String categoria;

    public Integer getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(Integer idcategoria) {
        this.idcategoria = idcategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
