/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Francois Gatherat <francois.gatherat@he-arc.ch>
 */
@Named(value = "addMovieToPersonBean")
@SessionScoped
public class AddMovieToPersonBean implements Serializable {
    
    private Person person;
    
   // private DataModel<Movie> moviesDM;
   
    
    @Inject Services services;
       
    /**
     * Reçoit la personne a qui on veut affecter un film.
     * 
     * @param person La personne a qui on veut affecter un film.
     * @return "success" si la personne a été reçue, sinon "failure".
     */
    public String getPerson(Person pers) {
        if(pers != null) {
            person = pers;
            return "success";
        } else {
            return "error";
        }
    }
    
    
    /**
     * Affecte le film à la personne.
     * 
     * @param movie Le film à affecter à la personne.
     * @return "success" si le film a bien été affecté, sinon "failure".
     */
    public String addMovie(Movie movie) {
        if(movie != null){
            person.addMovie(movie);
            return "success";
        }
        else {
            return "error";
        }
    }
}
