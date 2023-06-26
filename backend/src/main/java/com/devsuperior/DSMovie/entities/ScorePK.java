package com.devsuperior.DSMovie.entities;

import java.util.Objects;

public class ScorePK {

    private Movie movie;
    private User user;

    public ScorePK() {}

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ScorePK scorePK)) return false;
        return Objects.equals(getMovie(), scorePK.getMovie()) && Objects.equals(getUser(), scorePK.getUser());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getMovie(), getUser());
    }
}
