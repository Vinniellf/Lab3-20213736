package com.example.tareagtics.Models.Repositories;

import com.example.tareagtics.Models.Entities.Categoria;
import com.example.tareagtics.Models.Entities.Job;
import com.example.tareagtics.Models.Entities.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {


}
