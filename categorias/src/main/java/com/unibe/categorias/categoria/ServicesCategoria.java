package com.unibe.categorias.categoria;

import org.springframework.lang.NonNull;
import org.springframework.stereotype.Service;
import java.util.List;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor

public class ServicesCategoria {

    private final RepositoryCategoria repositoryCategoria;

    public List<EntityCategoria> findall() {
        return repositoryCategoria.findAll();
    }

    public EntityCategoria findById(@NonNull Long id) {
        return repositoryCategoria.findById(id).orElseThrow(() -> new RuntimeException("Categoria no encontrada" + id));
    }

    public EntityCategoria save(@NonNull EntityCategoria categoria) {
        return repositoryCategoria.save(categoria);
    }

}
