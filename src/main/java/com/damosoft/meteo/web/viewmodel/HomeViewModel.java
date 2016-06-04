package com.damosoft.meteo.web.viewmodel;

import com.damosoft.meteo.services.service.MeteoServiceAsker;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 * Created by User on 04/06/2016.
 */
@Named
@RequestScoped
public class HomeViewModel {
    private String aMessage = "Message from view model (not post construct :( )";

    @Inject
    MeteoServiceAsker asker;

    @PostConstruct
    public void reset() {
        this.aMessage = "Message from post construct";
    }

    public String getaMessage() {
        return aMessage;
    }

    public void setaMessage(String aMessage) {
        this.aMessage = aMessage;
    }

    public String getMeteo() {
        return asker.getMeteo("habay");
    }
}
