package com.example.transactional_timeout_demo.repository;

import com.example.transactional_timeout_demo.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
