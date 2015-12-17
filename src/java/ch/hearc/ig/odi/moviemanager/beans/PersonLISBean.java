/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ch.hearc.ig.odi.moviemanager.beans;

import ch.hearc.ig.odi.moviemanager.business.Person;
import ch.hearc.ig.odi.moviemanager.service.Services;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Francois Gatherat 
 */
@Named(value="personLISBean")
@RequestScoped
public class PersonLISBean implements Serializable { 
    
    private DataModel<Person> personDM;

    @Inject Services services;
    public PersonLISBean() {
    }
    
    public DataModel<Person> getPersonDM() {
        personDM = new ListDataModel<>();
        personDM.setWrappedData(services.getPeopleList());
        
        return personDM;
    }
}
