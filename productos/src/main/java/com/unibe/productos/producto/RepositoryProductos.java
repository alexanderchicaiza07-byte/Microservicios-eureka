package com.unibe.productos.producto;

import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryProductos extends org.springframework.data.jpa.repository.JpaRepository<EntityProductos, Long> {
    
}