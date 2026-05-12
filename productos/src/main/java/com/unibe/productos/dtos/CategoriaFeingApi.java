package com.unibe.productos.dtos;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="categorias")
public interface CategoriaFeingApi {

    @GetMapping("/api/categorias")
    public List<CategoriaDTO>obtenerCategorias();

    @GetMapping("/api/categorias/{id}")
    CategoriaDTO obtenerCategoriaPorID(@PathVariable("id") Long id);

    
}