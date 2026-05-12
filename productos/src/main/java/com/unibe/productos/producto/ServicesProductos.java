package com.unibe.productos.producto;
import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;

import com.unibe.productos.dtos.CategoriaDTO;
import com.unibe.productos.dtos.CategoriaFeingApi;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;


@Service
@Transactional
@RequiredArgsConstructor


public class ServicesProductos {

     private final RepositoryProductos repositoryProductos;
     private final CategoriaFeingApi categoriaFeingApi;

    public List<EntityProductos> findall() {
        return repositoryProductos.findAll();
    }

    public EntityProductos findById(@NonNull Long id) {
        return repositoryProductos.findById(id).orElseThrow(() -> new RuntimeException("Producto no encontrado" + id));
    }

    public EntityProductos save( @NonNull EntityProductos producto) {
        return repositoryProductos.save(producto);
    }

    public List<CategoriaDTO> findAllCategoria(){
        return categoriaFeingApi.obtenerCategorias();

    };

    
}
