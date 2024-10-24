package com.exemplo.sistemaAulas.repository;

import com.exemplo.sistemaAulas.model.Activity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ActivityRepository extends JpaRepository<Activity, Long> {
}
