package com.learn.hbm.service;

import com.learn.hbm.model.entity.many2many.Movie;
import com.learn.hbm.repository.MovieRepo;
import org.springframework.stereotype.Service;

@Service
public class MovieService {

    MovieRepo movieRepo;

    public MovieService(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    public Movie save(Movie movie){
        return movieRepo.save(movie);
    }

}
