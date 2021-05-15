package com.learn.hbm.model.entity.many2many;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "ACTOR_TBL")
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ACTOR_ID")
    private Long actorId;

    @Column(name = "FIRST_NAME")
    private String firstName;

    @Column(name = "LAST_NAME")
    private String lastName;

    @ManyToMany(mappedBy = "actors")
    private Set<Movie> movies = new HashSet<>();

    public Long getActorId() {
        return actorId;
    }

    public Actor setActorId(Long actorId) {
        this.actorId = actorId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public Actor setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public Actor setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Set<Movie> getMovies() {
        return movies;
    }

    public Actor setMovies(Set<Movie> movies) {
        this.movies = movies;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Actor actor = (Actor) o;
        return actorId.equals(actor.actorId) && firstName.equals(actor.firstName) && lastName.equals(actor.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(actorId, firstName, lastName);
    }
}
