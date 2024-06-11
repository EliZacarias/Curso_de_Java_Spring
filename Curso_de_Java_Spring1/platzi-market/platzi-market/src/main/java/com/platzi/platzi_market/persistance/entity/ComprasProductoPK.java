package com.platzi.platzi_market.persistance.entity;
import jakarta.persistence.*;
import java.io.Serializable;

//primero creamos la clase para insertar las llaves foráneas
//no va a mapear ninguna tabla

@Embeddable //esta clase lo vamos a embeber dentro de la clase
public class ComprasProductoPK implements Serializable {
    @Column(name = "id_compra")
    private Integer idCompra;

    @Column(name = "id_producto")
    private Integer idProducto;

    public Integer getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(Integer idCompra) {
        this.idCompra = idCompra;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }
}