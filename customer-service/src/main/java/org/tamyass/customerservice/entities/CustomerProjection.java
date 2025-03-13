package org.tamyass.customerservice.entities;

import org.springframework.data.rest.core.config.Projection;

/*
* cette interface permet de créer une config
*
* */
@Projection(name = "all", types = Customer.class)
public interface CustomerProjection {
    String getName();
    String getEmail();
}
