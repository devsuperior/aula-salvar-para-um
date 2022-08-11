package com.devsuperior.aula.repositories;

import com.devsuperior.aula.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
