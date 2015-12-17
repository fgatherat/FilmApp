/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.business;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Francois Gatherat
 */
public class Person {
    
    private long id;
    private String firstName;
    private String lastName;
    private int size;
    private Map<Long, Movie> movies;
    
    
    public Person(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        movies = new HashMap();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    
    
    /**
    *La classe ajoute le film qu'elle reçoit en paramètre à la liste des film.
    *@param movie le film à ajouter
    */
    public void addMovie (Movie movie) {
        movies.put(movie.getId(), movie);
        movie.addPerson(this);
        size = movies.size();
    }
    
    /**
    *Retourne la liste des film
    *@return liste des film
    */
    public Map<Long, Movie> getMovies() {
        return movies;
    }
}
