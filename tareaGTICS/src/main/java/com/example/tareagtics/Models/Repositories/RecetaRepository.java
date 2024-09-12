package com.example.tareagtics.Models.Repositories;

import com.example.tareagtics.Models.Entities.Categoria;
import com.example.tareagtics.Models.Entities.Receta;
import com.example.tareagtics.Models.Entities.RecetaIngredienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepository extends JpaRepository<Receta, Integer> {

    @Query(value = "select *from receta where nombre LIKE CONCAT('%', ?1, '%') and idcategoria = ?2", nativeQuery = true)
    List<Receta> buscarAmbos(String nombre, Integer categoria);

    @Query(value = "select *from receta where idcategoria = ?1", nativeQuery = true)
    List<Receta> buscarRecetaByCategoria(Integer categoria);

    @Query(value = "select *from receta where nombre LIKE CONCAT('%', ?1, '%')", nativeQuery = true)
    List<Receta> buscarRecetaByNombre(String nombre);

    @Query(value = "select *from receta order by dificultad asc", nativeQuery = true)
    List<Receta> creciente();

    @Query(value = "select *from receta order by dificultad desc", nativeQuery = true)
    List<Receta> decreciente();

    @Query(value = "select r.idreceta, r.idcategoria, r.nombre, r.instrucciones, r.dificultad, r.tiempo_preparacion  from receta r, receta_ingrediente ri where r.idreceta = ri.idreceta group by (r.idreceta) order by COUNT(ri.id_receta_ingrediente) asc", nativeQuery = true)
    List<Receta> crecienteIngrediente();

    @Query(value = "select r.idreceta, r.idcategoria, r.nombre, r.instrucciones, r.dificultad, r.tiempo_preparacion  from receta r, receta_ingrediente ri where r.idreceta = ri.idreceta group by (r.idreceta) order by COUNT(ri.id_receta_ingrediente) desc", nativeQuery = true)
    List<Receta> derecienteIngrediente();





}
