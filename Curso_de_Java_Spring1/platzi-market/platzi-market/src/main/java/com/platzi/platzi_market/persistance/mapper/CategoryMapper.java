package com.platzi.platzi_market.persistance.mapper;

import com.platzi.platzi_market.domain.Category;
import com.platzi.platzi_market.persistance.entity.Categoria;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")  //Para indicarle a mi proyecto que es un mapeador
                                    // e indicamos que es un componente tipo "spring"
public interface CategoryMapper {
    @Mappings({
            @Mapping(source = "idCategoria", target = "categoryId"),   //estos son los parametros que de categorias dentro de category
            @Mapping(source = "descripcion", target = "category"),
            @Mapping(source = "estado", target = "active"),

    })
    Category toCategory(Categoria categoria); //es la conversion de categoria a category

    @InheritInverseConfiguration //indica a mapstruct que lo de abajo hace el mapeado inverso
                                 // de lo de arriba,por lo que convierte de category a categoria
    @Mapping(target = "productos", ignore = true) //la variable productos se encuentra en categoria pero no en category por lo que lo ignoramos
    Categoria toCategoria(Category category);

}
