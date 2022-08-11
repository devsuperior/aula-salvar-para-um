package com.devsuperior.aula.repositories;

import com.devsuperior.aula.entities.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
