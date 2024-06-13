package com.platzi.platzi_market.persistance;

import com.platzi.platzi_market.persistance.crud.ProductoCrudRepository;
import com.platzi.platzi_market.persistance.entity.Producto;

import java.util.List;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> getAll(){
        return (List<Producto>)productoCrudRepository.findAll(); //tenemos que convertir(cast) el iterable de findAll
                                            // al tipo List<Productos>, que es lo que stamos solicitando, una lista de los productos en la BD

    }
}
