package com.unibe.categorias.categoria;

import java.util.List;

import org.springframework.lang.NonNull;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/categorias")
@CrossOrigin
@RequiredArgsConstructor
public class ControllerCategoria {

    private final ServicesCategoria servicesCategoria;


    @GetMapping()
    public List<EntityCategoria>getAllCategorias(){
        return servicesCategoria.findall();
    }

    @GetMapping("/{id}")
    public EntityCategoria getCategoriaById(@PathVariable("id") @NonNull Long id){
        return servicesCategoria.findById(id);
    }
    @PostMapping()
    public EntityCategoria saveCategoria( @RequestBody EntityCategoria categoria){
        return servicesCategoria.save(categoria);
    }

}
