package com.platzi.platzi_market.domain.repository;

import com.platzi.platzi_market.domain.Product;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    //nombre de los metodos que queremos que cualquier
    // repo que trabaje con productos tenga que implementar
    //implementa ProductoRepository


    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProducts(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

    //definimos las reglas que va a tener nuestro dominio al momento
    // que cualquier repo quiera acceder a productos dentro de nuestra DB

}
