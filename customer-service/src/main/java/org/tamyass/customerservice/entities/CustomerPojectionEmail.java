package org.tamyass.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

/*
* cette interface permet de créer une config
*
* */
@Projection(name = "email", types = Customer.class)
public interface CustomerPojectionEmail {
    String getEmail();
}
