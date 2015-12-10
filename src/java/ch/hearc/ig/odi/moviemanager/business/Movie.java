/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.business;

import java.util.Map;

/**
 *
 * @author Francois Gatherat <francois.gatherat@he-arc.ch>
 */
public class Movie {
    
    private long id;
    private String name;
    private String producer;
    private Map<Long, Person> persons;

    public Movie(long id, String name, String producer) {
        this.id = id;
        this.name = name;
        this.producer = producer;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }
    
    /*
    La classe ajoute la personne qu'elle reçoit en paramètre à la liste des personnes du film.
    */
    public void addPerson (Person person) {
        persons.put(person.getId(), person);
    }
    
    
}
