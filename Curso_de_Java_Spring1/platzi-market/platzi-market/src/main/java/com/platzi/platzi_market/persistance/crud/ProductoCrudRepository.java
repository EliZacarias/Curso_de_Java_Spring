package com.platzi.platzi_market.persistance.crud;

import com.platzi.platzi_market.persistance.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {//recibe dos parametros que es la tabla y el tipo de la clave primaria(integer)


}
