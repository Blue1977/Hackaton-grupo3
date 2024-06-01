package com.example.hackaton.artista.domain;

import com.example.hackaton.cancion.CancionService;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Artista {

    @Id
    private Long id;

    @Column(name = "name", nullable = false)
    private String Name;

    @OneToMany
    private Cancion cancion;


}
