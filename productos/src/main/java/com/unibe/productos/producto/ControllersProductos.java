package com.unibe.productos.producto;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/productos")
@CrossOrigin
@RequiredArgsConstructor
public class ControllersProductos {

    private final ServicesProductos servicesProductos;


    @GetMapping()
    public List<EntityProductos>getAllProductos(){
        return servicesProductos.findall();
    }

    @GetMapping("/{id}")
    public EntityProductos getProductoById(@PathVariable("id")  Long id){
        return servicesProductos.findById(id);
    }
    @PostMapping()
    public EntityProductos saveProducto( @RequestBody EntityProductos producto){
        return servicesProductos.save(producto);
    }

    
}
