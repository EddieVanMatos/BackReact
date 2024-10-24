package com.exemplo.sistemaAulas.repository;

import com.exemplo.sistemaAulas.model.VideoClass;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VideoClassRepository extends JpaRepository<VideoClass, Long> {
}
