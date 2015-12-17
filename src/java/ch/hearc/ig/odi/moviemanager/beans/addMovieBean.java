/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author Francois Gatherat
 */
@Named(value="addMovieBean")
@RequestScoped
public class addMovieBean implements Serializable {
    
    /**
    *Utilisation des beans validation
    */
    @Min(0)
    private long id;
    
    @NotNull
    private String name;
    
    @NotNull
    @Size(min=1, max=25)
    private String producer;

     @Inject Services services;
    public addMovieBean() {
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
    
    /**
    * La méthode ne peut pas retourner un null
    *@return "success" si le film est ajouté "errorr" si il n'est pas ajouté
    */
    @NotNull
    public String add(){
        try {
           services.addMovie(id, name, producer);
        
            return "success"; 
        }catch (Exception e ) {
            return "error";
        }
    }
}
