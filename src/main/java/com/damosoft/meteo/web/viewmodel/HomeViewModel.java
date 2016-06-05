package com.damosoft.meteo.web.viewmodel;

import com.damosoft.meteo.services.service.MeteoServiceAsker;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by User on 04/06/2016.
 */
@Named
@SessionScoped
public class HomeViewModel implements java.io.Serializable {
    private String aMessage = "Message from view model (not post construct :( )";

    final MeteoServiceAsker asker;
    private String town;

    public HomeViewModel() {
        asker = new MeteoServiceAsker();
    }

    @PostConstruct
    public void reset() {
        this.aMessage = "Message from post construct";
    }

    public void ask() {
        this.aMessage = asker.getMeteo(this.town);
    }

    public String getaMessage() {
        return aMessage;
    }

    public void setaMessage(String aMessage) {
        this.aMessage = aMessage;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public String getTown() {
        return town;
    }
}
