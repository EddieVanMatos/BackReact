package com.exemplo.sistemaAulas.repository;

import com.exemplo.sistemaAulas.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
