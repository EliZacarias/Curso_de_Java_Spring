package com.platzi.platzi_market.persistance.crud;

import com.platzi.platzi_market.persistance.entity.Producto;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {//recibe dos parametros que es la tabla y el tipo de la clave primaria(integer)

    //Para trabajar con QueryMethods aqui se crean

    //se puede utilizar de esta manera
    //@Query(value = "SELECT * FROM productos WHERE id_categoria = ?",nativeQuery = true)
    //ó
    List<Producto> findByIdCategoriaOrderByNombreAsc(int idCategoria); //deseamos consultaar una lista de productos por medio del idCategoria
                                    //Se pone IdCategoria y no idCategoria, porque tenemos que respetar el camel case
                                    // se pone el mismo nombre a la variable de entrada
                                    // se pueden nombrar de cualquier manera, en ves de findByIdCategoria podría ser getByCategoria

    Optional<List<Producto>> findByCantidadStockLessThanAndEstado(int cantidadStock, boolean estado); //tambien soportan los operador opcionales de los nuevas v de java





}
