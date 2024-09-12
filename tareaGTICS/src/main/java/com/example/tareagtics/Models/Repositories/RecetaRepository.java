package com.example.tareagtics.Models.Repositories;

import com.example.tareagtics.Models.Entities.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer> {
    List<Receta> findByNombreContainingIgnoreCase(String nombre);

    // Buscar recetas por categoría
    List<Receta> findByCategoriaIgnoreCase(String categoria);

    // Buscar por nombre y categoría al mismo tiempo
    List<Receta> findByNombreContainingIgnoreCaseAndCategoriaIgnoreCase(String nombre, String categoria);

}
