package com.trainning.udemy.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trainning.udemy.models.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {}
