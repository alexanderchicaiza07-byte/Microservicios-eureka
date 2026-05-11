package com.unibe.productos.producto;
import java.util.List;
import org.springframework.stereotype.Service;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor


public class ServicesProductos {

     private final RepositoryProductos repositoryProductos;

    public List<EntityProductos> findall() {
        return repositoryProductos.findAll();
    }

    public EntityProductos findById(Long id) {
        return repositoryProductos.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado" + id));
    }

    public EntityProductos save( EntityProductos producto) {
        return repositoryProductos.save(producto);
    }
    
}
