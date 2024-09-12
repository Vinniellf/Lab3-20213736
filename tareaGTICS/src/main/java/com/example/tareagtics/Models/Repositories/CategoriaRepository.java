package com.example.tareagtics.Models.Repositories;

import com.example.tareagtics.Models.Entities.Categoria;
import com.example.tareagtics.Models.Entities.Job;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
