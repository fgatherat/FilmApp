/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Movie;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Francois Gatherat <francois.gatherat@he-arc.ch>
 */
@Named(value="filmLISBean")
@RequestScoped
public class FIlmLISBean implements Serializable{
    private DataModel<Movie> movieDM;
    private int size;

    @Inject Services services;
    public FIlmLISBean() {
        
    }
    
    public DataModel<Movie> getFilmDM() {
        movieDM = new ListDataModel<>();
        movieDM.setWrappedData(services.getMoviesList());
        return movieDM;
    }
}
