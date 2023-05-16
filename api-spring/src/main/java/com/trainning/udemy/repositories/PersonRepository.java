package com.trainning.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainning.udemy.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {}