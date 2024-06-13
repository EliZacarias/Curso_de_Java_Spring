package com.platzi.platzi_market.persistance;

import com.platzi.platzi_market.persistance.crud.ProductoCrudRepository;
import com.platzi.platzi_market.persistance.entity.Producto;

import java.util.List;
import java.util.Optional;

public class ProductoRepository {
    private ProductoCrudRepository productoCrudRepository;
    public List<Producto> getAll(){
        return (List<Producto>)productoCrudRepository.findAll(); //tenemos que convertir(cast) el iterable de findAll
                                            // al tipo List<Productos>, que es lo que stamos solicitando, una lista de los productos en la BD
    }

    public List<Producto> getByCategoria(int idCategoria){
        return productoCrudRepository.findByIdCategoriaOrderByNombreAsc(idCategoria);  //se utliza el metodo de la interfaz en esta nueva clase
                                                //y se realiza ordenado de manera ascendente

    }

    public Optional<List<Producto>> getEscasos(int cantidad){
        return productoCrudRepository.findByCantidadStockLessThanAndEstado(cantidad,true);
    }
}
