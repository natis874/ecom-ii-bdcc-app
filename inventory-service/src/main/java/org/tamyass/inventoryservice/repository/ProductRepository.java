package org.tamyass.inventoryservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.tamyass.inventoryservice.entities.Product;
@RepositoryRestResource
public interface ProductRepository extends JpaRepository<Product,String> {

}
