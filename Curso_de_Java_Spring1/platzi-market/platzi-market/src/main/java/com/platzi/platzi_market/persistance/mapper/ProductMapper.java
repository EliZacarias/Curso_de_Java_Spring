package com.platzi.platzi_market.persistance.mapper;

import com.platzi.platzi_market.domain.Product;
import com.platzi.platzi_market.persistance.entity.Producto;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "Spring", uses = {CategoryMapper.class}) //como estamos usando category y ya tiene su mapper
                                                                // propio agregamos el uses para agregar la clase de categoria ocupada para mapear
commtpublic interface ProductMapper {
    @Mappings({
            @Mapping(source = "idProducto", target = "productId"),
            @Mapping(source = "nombre", target = "name"),
            @Mapping(source = "idCategoria", target = "categoryId"),
            @Mapping(source = "precioVenta", target = "price"),
            @Mapping(source = "cantidadStock", target = "stock"),
            @Mapping(source = "estado", target = "active"),
            @Mapping(source = "categoria", target = "category"),

    })
    Product toProduct(Producto producto);
    List<Product> toProducts(List<Producto> productos);


    @InheritInverseConfiguration
    @Mapping(target = "codigoBarras", ignore = true)
    Producto toProducto(Product product);
}
