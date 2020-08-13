package com.minja;

import com.minja.controllers.NaseljenoMestoController;
import com.minja.controllers.StudentController;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.servlet.ServletProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(StudentController.class);
        register(NaseljenoMestoController.class);

        /* Red dole služi da proradi statički sadržaj.
           Uključivanjem Jersey biblioteke izgubićemo statički sadržaj.
           Ovaj kod dole ponovo uključuje statički sadržaj.
           Da bi ovo radilo, potrebno je i da se u application.properties stavi:
           spring.jersey.type=filter
        */
        property(ServletProperties.FILTER_FORWARD_ON_404, true);
    }
   
}