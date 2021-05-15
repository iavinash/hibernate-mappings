package com.learn.hbm.model.entity.many2many;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "MOVIE_TBL")
public class Movie implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "MOVIE_ID")
    private Long movieId;

    @Column(name = "MOVIE_NAME")
    private String movieName;

    @ManyToMany(cascade = CascadeType.PERSIST)
    @JoinTable(
        name = "MOVIE_ACTOR_MAPPER",
        joinColumns = {@JoinColumn(name = "MOVIE_TBL_ID")},
        inverseJoinColumns = {@JoinColumn(name = "ACTOR_TBL_ID")}
    )
    private Set<Actor> actors = new HashSet<>();

    public Long getMovieId() {
        return movieId;
    }

    public Movie setMovieId(Long movieId) {
        this.movieId = movieId;
        return this;
    }

    public String getMovieName() {
        return movieName;
    }

    public Movie setMovieName(String movieName) {
        this.movieName = movieName;
        return this;
    }

    public Set<Actor> getActors() {
        return actors;
    }

    public Movie setActors(Set<Actor> actors) {
        this.actors = actors;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return movieId.equals(movie.movieId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(movieId);
    }
}
