package com.platzi.platzi_market.persistance;

import com.platzi.platzi_market.domain.Product;
import com.platzi.platzi_market.domain.repository.ProductRepository;
import com.platzi.platzi_market.persistance.crud.ProductoCrudRepository;
import com.platzi.platzi_market.persistance.entity.Producto;
import com.platzi.platzi_market.persistance.mapper.ProductMapper;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductoRepository implements ProductRepository { //

    private ProductoCrudRepository productoCrudRepository;
    private ProductMapper mapper; //implementamos el mapeado

    @Override //lo estmos utilizando de la interface
    public List<Product> getAll(){
        List<Producto> productos = (List<Producto>) productoCrudRepository.findAll();
        return mapper.toProducts(productos) ; //implementamos
    }

    @Override
    public Optional<List<Product>> getByCategory(int categoryId) {
        List<Producto> productos = productoCrudRepository.findByIdCategoriaOrderByNombreAsc(categoryId);
        return Optional.of(mapper.toProducts(productos));
    }

    @Override
    public Optional<List<Product>> getScarseProducts(int quantity) {
        Optional<List<Producto>> productos = productoCrudRepository.findByCantidadStockLessThanAndEstado(quantity,true);
        return productos.map(prods -> mapper.toProducts(prods));
    }

    @Override
    public Optional<Product> getProduct(int productId) {
        Optional<Product> product = productoCrudRepository.findById(productId).map(producto -> mapper.toProduct(producto));
        return product;
    }

    @Override
    public Product save(Product product) {
        Producto producto = mapper.toProducto(product);
        return mapper.toProduct(productoCrudRepository.save(producto));
    }

    @Override
    public void delete(int productId){ //borra un producto por medio de su id
        productoCrudRepository.deleteById(productId);
    }
}
