package com.devsuperior.dsmoive.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmoive.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
