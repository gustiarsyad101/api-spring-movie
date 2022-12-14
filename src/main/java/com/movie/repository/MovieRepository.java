package com.movie.repository;

import com.movie.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//@EnableJpa
public interface MovieRepository extends JpaRepository<Movie, Integer> {
}
