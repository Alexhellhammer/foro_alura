package com.proyectAlex.Challenge_Foro_Alura.repositories;

import com.proyectAlex.Challenge_Foro_Alura.models.Topico;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicoRepository extends JpaRepository<Topico, Long> {
}


