package com.learn.hbm.repository;

import com.learn.hbm.model.entity.many2many.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepo extends JpaRepository<Movie, Long> {

}
