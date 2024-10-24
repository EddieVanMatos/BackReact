package com.exemplo.sistemaAulas.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class VideoClass {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String youtubeId;

    @ManyToOne
    private Course course;

    public void setId(String youtubeId) {
    }
}
