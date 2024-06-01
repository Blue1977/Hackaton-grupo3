package com.example.hackaton.artista.infraestructure;

import com.example.hackaton.artista.domain.Artista;
import org.springframework.data.jpa.repository.JpaRepository;

public class ArtistaRepository extends JpaRepository<Artista, Integer> {
}
