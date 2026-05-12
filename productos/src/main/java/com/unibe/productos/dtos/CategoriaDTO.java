package com.unibe.productos.dtos;
import java.time.LocalDate;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
public class CategoriaDTO {

    private Long id;
    private String name;
    private String description;
    private String observation;
    private LocalDate createDate;
    private Integer valueCategory;
    private String slugs;
    private Integer priority;
    private String email;
    
}
