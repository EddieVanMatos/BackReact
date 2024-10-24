package com.exemplo.sistemaAulas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String enunciado;

    @ManyToOne
    private Course course;
}
