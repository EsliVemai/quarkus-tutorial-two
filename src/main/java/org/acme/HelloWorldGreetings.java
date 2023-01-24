package org.acme;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class HelloWorldGreetings {

    public String greeting(String name) {
        return name + " from Quarkus ";
    }

}
