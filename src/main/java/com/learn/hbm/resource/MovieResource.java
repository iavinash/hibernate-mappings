package com.learn.hbm.resource;

import com.learn.hbm.model.entity.many2many.Movie;
import com.learn.hbm.service.MovieService;
import org.springframework.web.bind.annotation.*;

import static com.learn.hbm.resource.ResourceConstants.CREATE;
import static com.learn.hbm.resource.ResourceConstants.MOVIE;
import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequestMapping(MOVIE)
public class MovieResource {

    MovieService movieService;

    public MovieResource(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping(CREATE)
    @ResponseStatus(CREATED)
    public Movie create(@RequestBody Movie movie){
        return movieService.save(movie);
    }
}
