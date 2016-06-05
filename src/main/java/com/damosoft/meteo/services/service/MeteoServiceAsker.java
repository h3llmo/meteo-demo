package com.damosoft.meteo.services.service;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;

/**
 * Created by User on 04/06/2016.
 */

public class MeteoServiceAsker {
    public String getMeteo(final String town) {
        Client client = ClientBuilder.newClient();
        return client.target("http://localhost:8081/MeteoProvider/rest/meteo/" + town).request().get(String.class);
    }
}
