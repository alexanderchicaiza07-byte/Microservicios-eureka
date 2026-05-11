package com.unibe.categorias.categoria;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RepositoryCategoria extends JpaRepository<EntityCategoria, Long> {
    
}
